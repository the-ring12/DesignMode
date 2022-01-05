package com.ring.template;

/**
 * 具体子类——转账
 *
 * @author: the_ring
 * @time: 2022/1/5 15:09
 */
public class Transfer extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("转账");
    }
}
