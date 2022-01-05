package com.ring.strategy;

import com.ring.util.XMLUtil;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/5 14:32
 */
public class Client {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 2, 3, 10, 4};
        int[] result;
        ArrayHandler arrayHandler = new ArrayHandler();

        Sort sort;
        sort = (Sort) XMLUtil.getBean("strategy");

        arrayHandler.setSortObj(sort);
        result = arrayHandler.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
