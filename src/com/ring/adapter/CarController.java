package com.ring.adapter;

/**
 * @projectName: DesignMode
 * @package: com.ring.adapter
 * @className: CarController
 * @author: the_ring
 * @description: 控制类
 * @date: 2022/1/4 11:01
 * @version: 1.0
 */
public abstract class CarController {
    public void move() {
        System.out.println("玩具汽车移动！");
    }

    /**
     * 灯光
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/4 11:03
     */
    public abstract void sound();

    /**
     * 灯光
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/4 11:04
     */
    public abstract void light();
}
