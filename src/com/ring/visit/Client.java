package com.ring.visit;

import com.ring.util.XMLUtil;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:28
 */
public class Client {
    public static void main(String[] args) {
        Product b1 = new Book();
        Product b2 = new Book();
        Product a1 = new Apple();
        Visitor visitor;

        BuyBasket buyBasket = new BuyBasket();
        buyBasket.addProduct(b1);
        buyBasket.addProduct(b2);
        buyBasket.addProduct(a1);

        visitor = (Visitor) XMLUtil.getBean("visit");
        visitor.setName("张三");
        buyBasket.accept(visitor);
    }
}
