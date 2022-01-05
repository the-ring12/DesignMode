package com.ring.strategy;

/**
 * 具体策略类——快速排序
 *
 * @author: the_ring
 * @time: 2022/1/5 14:36
 */
public class QuickSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        System.out.println("快速排序");
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr, int start, int end) {
        if (start < end) {
            int left = start, right = end;
            int tmp = arr[start];
            while (left < right) {
                while (arr[right] > tmp && left < right) {
                    right--;
                }
                if (left < right) {
                    arr[left] = arr[right];
                    left++;
                }
                while (arr[left] < tmp && left < right) {
                    left++;
                }
                if (left < right) {
                    arr[right] = arr[left];
                    right--;
                }
            }
            arr[right] = tmp;
            sort(arr, start, right - 1);
            sort(arr, right + 1, end);
        }
    }
}
