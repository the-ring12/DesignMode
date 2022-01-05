package com.ring.obsever;

/**
 * 具体观察者类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:25
 */
public class Dog implements MyObserver {
    @Override
    public void response() {
        System.out.println("狗跟着叫!");
    }
}
