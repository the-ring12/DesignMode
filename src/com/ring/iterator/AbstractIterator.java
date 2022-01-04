package com.ring.iterator;

/**
 * 抽象迭代器
 *
 * @author: the_ring
 * @time: 2022/1/4 17:51
 */
public interface AbstractIterator {
    /**
     * 移至下一个元素
     */
    void next();

    /**
     * 判断是否为最后一个元素
     *
     * @return
     */
    boolean isLast();

    /**
     * 移至上一个元素
     */
    void previous();

    /**
     * 判断是否为第一个元素
     *
     * @return
     */
    boolean isFirst();

    /**
     * 获取下一个元素
     *
     * @return
     */
    Object getNextItem();

    /**
     * 获取上一个元素
     *
     * @return
     */
    Object getPreviousItem();
}
