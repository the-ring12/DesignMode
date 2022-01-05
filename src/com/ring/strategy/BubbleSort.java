package com.ring.strategy;

/**
 * 具体策略类——冒泡排序
 *
 * @author: the_ring
 * @time: 2022/1/5 14:13
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("冒泡排序");
        return arr;
    }
}
