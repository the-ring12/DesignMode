package com.ring.obsever;

import java.util.ArrayList;
import java.util.Observer;

/**
 * 抽象目标类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:17
 */
public abstract class MySubject {
    protected ArrayList observers = new ArrayList<>();

    /**
     * 注册方法
     *
     * @param observer
     */
    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    /**
     * 注销方法
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 抽象通知方法
     */
    public abstract void cry();
}
