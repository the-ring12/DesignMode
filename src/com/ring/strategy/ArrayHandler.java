package com.ring.strategy;

/**
 * 环境类——数组处理类
 *
 * @author: the_ring
 * @time: 2022/1/5 14:30
 */
public class ArrayHandler {
    private Sort sortObj;

    public int[] sort(int[] arr) {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}
