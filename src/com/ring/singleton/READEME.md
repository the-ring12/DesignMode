# 单例模式

确保一个类只有一个实例，并提供一个全局访问点来访问这个唯一的实例。

### 1. 饿汉式单例

饿汉式单例类（Eager Singleton）是实现起来最简答的单例类

```java
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {}
    
    public static EagerSingleton getInstance() {
        return instance;
    }
}
```

当类被加载时，静态变量 instance 会被初始化，此时类的私有构造函数会被调用，单例的唯一实例将被创建。

### 2. 懒汉式单例类与双重检查锁定

懒汉式单例类在第一次被引用时将自己实例化，在懒汉式单例类被加载时不会将自己实例化。

```java
public class LazySingleton {
    private static LazySingleton instance = null;
    
    private LazySingleton() {}
    
    // 使用 synchronized 关键字对方法加锁，确保任意时刻只有一个线程可执行该方法
    synchronized public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```

```java
public class LazySingleton {
    private volatile static LazySingleton instance = null;
    
    private LazySingleton() {}
    
    // 使用 synchronized 关键字对方法加锁，确保任意时刻只有一个线程可执行该方法
    synchronized public static LazySingleton getInstance() {
        // 第一重判断
        if (instance == null) {
            // 锁定代码块
            synchronized (LazySingleton.class) {
                // 第二重判断
                if (instance == null) {
                    // 创建单例实例
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
```

> 被 volatile 修饰的成员变量可以确保多个线程都能够正确处理，且该代码只能在 JDK 1.5 及以上才能被正确执行。由于 volatile 关键字会屏蔽 Java 虚拟机所做的一些代码优化，可能会导致系统的运行效率降低，因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。

### 3. 饿汉式单例类和懒汉式单例类的比较

饿汉式单例类在类被加载式就将自己实例化，它的优点在于无须考虑多个线程同时访问的问题，可以确保实例的唯一性；从调用速度和反应时间角度来讲，由于单例对象一开始就得以创建，因此要优于懒汉式单例。

但是无论系统在运行时是否需要使用该单例对象，由于在类加载时该对象就需要创建，因此从资源利用效率角度来讲饿汉式单例不及懒汉式单例，而且在系统加载时需要创建饿汉式单例对象，加载时间可能会比较长。

懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，但是必须处理多个线程同时访问的问题，特别是当单例类作为资源控制器，在实例化时必然涉及资源初始化，而资源初始化很有可能耗费大量时间，这意味着出现多线程同时首次引用此类的几率变得较大，需要通过双重检查锁定等机制进行控制，这将导致系统性能收到一定影响。

#### 4. 使用静态内部类实现单例模式

在 Java 语言中可以通过 Initialization on Demand Holder （IoDH）技术来实现单例模式。

```java
public class Singleton {
    private Singleton() {
    }

    // 静态内部类
    private static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Sigleton s1, s2;
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
```

**单例模式的优点**

（1）单例模式提供了对唯一实例的受控访问。因为单例模式封装了它的唯一实例，所以它可以严格控制客户怎样以及何时访问它。

（2）由于系统内存中只存在一个对象，因此可以节约系统资源，对于一些需要频繁创建和销毁的对象，单例模式无疑可以提高系统的性能。

（3）允许可变数目的实例。基于单例模式可以进行扩展，使用与控制单例对象相似的方法来获得指定个数的实例对象，即节省系统资源，又解决了由于单例对象共享过多有损性能的问题。

**单例模式的缺点**

（1）由于单例模式中没有抽象层，因此单例类的扩展有很大困难。

（2）单例类的职责过重，在一定程度上违背了单一职责原则。因为单例类即提供了业务方法，又提供了创建对象的方法（工厂方法），将对象的创建和对象本身的功能耦合在一起。

（3）现在很多面向对象语言（如 Java、C#）的运行环境都提供了自动垃圾回收技术，因此如果实例化的共享对象长时间不被利用，系统会认为它是垃圾，会自动销毁并回收资源，下次利用时又将重新实例化，这将导致共享的单例对象状态丢失。

**单例模式适用场景**
（1）系统只需要一个实例对象，例如系统要求提供一个唯一的序列号生成器或资源管理器，或者因为资源消耗太大而只允许创建一个对象。

（2）客户调用类的单个实例只允许使用一个公共访问点，除了该公共访问点，不能通过其他途径访问该实例。