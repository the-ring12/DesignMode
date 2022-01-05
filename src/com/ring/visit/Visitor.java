package com.ring.visit;

/**
 * 抽象访问者类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:14
 */
public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    /**
     * visit (apple)
     *
     * @param apple
     */
    public abstract void visit(Apple apple);

    /**
     * visit(book)
     *
     * @param book
     */
    public abstract void visit(Book book);
}
