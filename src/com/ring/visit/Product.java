package com.ring.visit;

/**
 * 抽象元素类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:14
 */
public interface Product {
    /**
     * accept
     *
     * @param visitor
     */
    void accept(Visitor visitor);
}
