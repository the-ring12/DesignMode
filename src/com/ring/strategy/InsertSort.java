package com.ring.strategy;

/**
 * 具体策略类——插入排序
 *
 * @author: the_ring
 * @time: 2022/1/5 14:21
 */
public class InsertSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j = 0;
            int tmp = arr[i];
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > tmp) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
                arr[j] = tmp;
            }
        }
        System.out.println("插入排序");
        return arr;
    }
}
