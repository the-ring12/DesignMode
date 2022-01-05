package com.ring.template;

import com.ring.util.XMLUtil;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:11
 */
public class Client {
    public static void main(String[] args) {
        BankTemplateMethod method;
        method = (BankTemplateMethod) XMLUtil.getBean("template");
        method.process();
        System.out.println("-----------------------------------");
    }
}
