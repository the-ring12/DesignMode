package com.ring.flyweight.simple;

/**
 * 围棋棋子类
 *
 * @author: the_ring
 * @time: 2022/1/4 15:39
 */
public abstract class BaseIgoChessman {
    /**
     * getColor
     *
     * @return
     */
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}
