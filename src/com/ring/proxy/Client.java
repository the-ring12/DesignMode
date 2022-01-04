package com.ring.proxy;

import com.ring.util.XMLUtil;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:26
 */
public class Client {
    public static void main(String[] args) {
        // 针对抽象编程，客户端无须分辨真实主题类和代理类
        Searcher searcher;
        searcher = (Searcher) XMLUtil.getBean("proxy");
        String result = searcher.doSearch("杨过", "玉女心经");
        System.out.println(result);
    }
}
