package com.ring.proxy;

/**
 * 抽象查询类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:14
 */
public interface Searcher {
    /**
     * 查询
     *
     * @param userId
     * @param keyword
     * @return
     */
    String doSearch(String userId, String keyword);
}
