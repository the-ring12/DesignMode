# 装饰模式

动态地给一个对象增加一些额外的职责。就扩展功能而言，装饰模式提供一种比使用子类更加灵活的替代方案。

- Component（抽象构件）

  它是具体构建和抽象装饰类的共同父类，声明了在具体构件中实现的业务方法，它的引入可以使客户端以一致的方式处理未被装饰的对象以及装饰之后的对象。
- ConcreteComponent（具体构件）

  它是抽象构建类的子类，用于定义具体的构件对象，实现了在抽象构件中声明的方法，装饰类可以给它增加额外的职责（方法）

- Decorator（抽象装饰类）

  它也是抽象构件类的子类，用于给具体构件增加职责，但具体职责在其子类中实现，他维护一个只想抽象构件对象的引用，通过该引用可以调用装饰之前构建对象的方法，并通过其子类扩展该方法，以达到装饰的目的。

- ConcreteDecorator（具体装饰类）

  它是抽象装饰类的子类，负责向构件添加新的职责。每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用于扩充对象的行为。

> 某软件公司基于面向对象技术开发了一套图形界面构件库 VisualComponent，该构件库提供了大量的基础构件，如窗体、文本、列表框等，由于在使用该构件库时用户经常要求定制一些特殊的显示效果，如带滚动条的窗体、带黑色边框的文本框、既带滚动条又带黑色边框的列表框等，因此经常需要对该构件库进行扩展以增强其功能。
>
> 使用装饰模式来设计该图形化界面构件库。

<img src="./Package%20decorator.png" alt="装饰模式">

**装饰模式的优点**

（1）对于扩展一个对象的功能，装饰模式比继承更加灵活，不会导致类的个数急剧增加。

（2）可以通过一种动态的方式来扩展一个对象的功能，通过配置文件可以在运行时选择不同的具体装饰类，从而实现不同的行为。

（3）可以针对一个对象进行多次装饰，通过使用不同的具体装饰类以及这些装饰类的排列组合可以创造出很多不同行为的组合，得到功能更加强大的对象。

（4）具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，原有类库代码无须改变，符合开闭原则。

**装饰模式的缺点**

（1）在使用装饰模式进行系统设计时将产生很多小对象，这些对象的区别在于它们之间相互连接的方式有所不同，而不是它们的类或者属性值所有不同，大量小对象的产生势必占用更多的系统资源，在一定程度上影响程序的性能。

（2）装饰模式提供了一种比继承更加灵活、机动的解决方案，但同时也意味着比继承更加易于出错，排错也更困难，对于多次装饰的对象，在调式时寻找错误可能需要逐级排查，较为繁琐。

**装饰模式适用场景**

（1）在不影响其他对象的情况下以动态、透明的方式给单个对象添加职责。

（2）当不能采用继承的方式对系统进行扩展或者采用继承不利于系统扩展和维护时，可以使用装饰模式。不能采用继承的情况主要有两类：第一类是系统中存在大量独立的扩展，为支持每一种扩展或者扩展之间的组合将产生大量的子类，使得子类数目呈爆炸性增长；第二类是因为类已定义为不能被继承。