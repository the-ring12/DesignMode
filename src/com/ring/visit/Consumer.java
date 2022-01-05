package com.ring.visit;

/**
 * 具体访问者类——顾客类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:19
 */
public class Consumer extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客" + name + "选苹果。");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客" + name + "买书。");
    }
}
