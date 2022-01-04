package com.ring.proxy;

/**
 * 日志记录类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:11
 */
public class Logger {
    /**
     * 模拟实现日志记录
     *
     * @param userId
     */
    public void log(String userId) {
        System.out.println("更新数据库，用户'" + userId + "'查询次数加1！");
    }
}
