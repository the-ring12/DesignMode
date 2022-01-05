package com.ring.template;

/**
 * 具体子类——取款
 *
 * @author: the_ring
 * @time: 2022/1/5 15:10
 */
public class Withdraw extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("取款");
    }
}
