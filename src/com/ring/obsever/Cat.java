package com.ring.obsever;

/**
 * 具体目标类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:23
 */
public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫！");
        System.out.println("--------------------------");

        for (Object observer : observers) {
            ((MyObserver) observer).response();
        }
    }
}
