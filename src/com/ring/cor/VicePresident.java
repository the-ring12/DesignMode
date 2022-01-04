package com.ring.cor;

/**
 * 副董事长类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:42
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    /**
     * 具体请求处理方法
     *
     * @param request
     */
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            // 处理请求
            System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + ".");
        } else {
            // 转发请求
            this.successor.processRequest(request);
        }
    }
}
