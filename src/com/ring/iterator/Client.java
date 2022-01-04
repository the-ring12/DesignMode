package com.ring.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 18:02
 */
public class Client {

    public static void main(String[] args) {
        List<Object> products = new ArrayList<>();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList list;
        AbstractIterator iterator;

        // 创建聚合对象
        list = new ProductList(products);
        // 创建迭代器对象
        iterator = list.createIterator();

        System.out.println("正向遍历：");
        while (!iterator.isLast()) {
            System.out.print(iterator.getNextItem() + ",");
            iterator.next();
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("逆向遍历：");
        while (!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem() + ",");
            iterator.previous();
        }
    }
}
