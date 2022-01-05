package com.ring.template;

/**
 * 抽象类——银行业务办理流程
 *
 * @author: the_ring
 * @time: 2022/1/5 15:06
 */
public abstract class BankTemplateMethod {
    public void takeNumber() {
        System.out.println("取号排队。");
    }

    /**
     * transact
     */
    public abstract void transact();

    public void evaluate() {
        System.out.println("反馈评分。");
    }

    public void process() {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}
