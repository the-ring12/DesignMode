package com.ring.cor;

/**
 * 董事会类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:45
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    /**
     * 具体请求处理方法
     *
     * @param request
     */
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
    }
}
