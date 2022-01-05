package com.ring.obsever;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:27
 */
public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();

        MyObserver observer1, observer2, observer3;
        observer1 = new Mouse();
        observer2 = new Mouse();
        observer3 = new Dog();

        subject.attach(observer1);
        subject.attach(observer2);
        subject.attach(observer3);

        subject.cry();
    }
}
