package com.ring.visit;

/**
 * 具体访问者类——收银员类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:21
 */
public class Saler extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("收银员" + name + "给苹果过秤，然后计算其价格。");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员" + name + "直接计算书的价格。");
    }
}
