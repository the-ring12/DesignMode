package com.ring.visit;

/**
 * 具体元素类——苹果类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:16
 */
public class Apple implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
