package com.ring.strategy;

/**
 * 具体策略类——选择排序
 *
 * @author: the_ring
 * @time: 2022/1/5 14:17
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int tmp = arr[i];
            int smallLocation = i;
            for (int j = i + 1; j < len; j++) {
                if (tmp > arr[j]) {
                    tmp = arr[j];
                    smallLocation = j;
                }
            }
            arr[smallLocation] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("选择排序");
        return arr;
    }
}
