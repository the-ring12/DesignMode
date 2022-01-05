package com.ring.visit;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 对象结构——购物车类
 *
 * @author: the_ring
 * @time: 2022/1/5 15:24
 */
public class BuyBasket {
    private final ArrayList list = new ArrayList();

    public void accept(Visitor visitor) {
        Iterator i = list.iterator();

        while (i.hasNext()) {
            ((Product) i.next()).accept(visitor);
        }
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void removeProduct(Product product) {
        list.remove(product);
    }
}
