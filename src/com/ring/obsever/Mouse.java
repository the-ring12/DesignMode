package com.ring.obsever;

/**
 * 具体观察者类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:25
 */
public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("老鼠努力逃跑！");
    }
}
