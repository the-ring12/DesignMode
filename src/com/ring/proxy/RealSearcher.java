package com.ring.proxy;

/**
 * 具体查询类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:15
 */
public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户'" + userId + "'使用关键字'" + keyword + "'查询商务信息!");
        return "返回具体内容";
    }
}
