package com.ring.adapter;

import com.ring.util.XMLUtil;

/**
 * @projectName: DesignMode
 * @package: com.ring.adapter
 * @className: Client
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 11:13
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        CarController car;
        car = (CarController) XMLUtil.getBean("adapter");
        car.move();
        car.sound();
        car.light();
    }
}
