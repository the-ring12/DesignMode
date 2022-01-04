package com.ring.cor;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:46
 */
public class Client {
    public static void main(String[] args) {
        Approver wjZhang, gYang, jGuo, meeting;
        wjZhang = new Director("张无忌");
        gYang = new VicePresident("杨过");
        jGuo = new President("郭靖");
        meeting = new Congress("董事会");

        // 创建职责链
        wjZhang.setSuccessor(gYang);
        gYang.setSuccessor(jGuo);
        jGuo.setSuccessor(meeting);

        // 创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjZhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
        wjZhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
        wjZhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        wjZhang.processRequest(pr4);
    }
}
