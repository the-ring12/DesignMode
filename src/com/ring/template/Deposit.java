package com.ring.template;

/**
 * 具体子类——存款类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:08
 */
public class Deposit extends BankTemplateMethod {
    @Override
    public void transact() {
        System.out.println("存款");
    }
}
