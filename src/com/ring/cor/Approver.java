package com.ring.cor;

/**
 * 审批者类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:34
 */
public abstract class Approver {
    /**
     * 定义后继对象
     */
    protected Approver successor;
    /**
     * 审批者姓名
     */
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 设置后继者
     *
     * @param successor
     */
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    /**
     * 抽象请求处理方法
     *
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);
}
