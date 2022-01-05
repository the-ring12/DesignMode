package com.ring.visit;

/**
 * 具体元素类——书籍类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:17
 */
public class Book implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
