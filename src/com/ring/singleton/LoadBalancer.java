package com.ring.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @projectName: DesignMode
 * @package: com.ring.singleton
 * @className: LoadBalancer
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 17:20
 * @version: 1.0
 */
public class LoadBalancer {
    /**
     * 私有成员变量，存储唯一实例
     */
    private static LoadBalancer instance = null;

    /**
     * 服务器集合
     */
    private List serverList = null;

    /**
     * 私有构造函数
     *
     * @param :
     * @return null
     * @author the_ring
     * @date 2022/1/3 17:22
     */
    private LoadBalancer() {
        this.serverList = new ArrayList();
    }

    /**
     * 公有静态成员方法，返回唯一实例
     *
     * @param :
     * @return LoadBalancer
     * @author the_ring
     * @date 2022/1/3 17:23
     */
    public static LoadBalancer getLoadBalancer() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    /**
     * 增加服务器
     *
     * @param server:
     * @return void
     * @author the_ring
     * @date 2022/1/3 17:24
     */
    public void addServer(String server) {
        serverList.add(server);
    }

    /**
     * 删除服务器
     *
     * @param server:
     * @return void
     * @author the_ring
     * @date 2022/1/3 17:24
     */
    public void removeServer(String server) {
        serverList.remove(server);
    }

    /**
     * 使用 Random 类随机获取服务器
     *
     * @param :
     * @return String
     * @author the_ring
     * @date 2022/1/3 17:26
     */
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
