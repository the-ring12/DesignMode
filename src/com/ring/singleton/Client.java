package com.ring.singleton;

/**
 * @projectName: DesignMode
 * @package: com.ring.singleton
 * @className: Client
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 17:26
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 创建 4 个 LoadBalancer 对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        // 判断服务器负载均衡是否相同
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        // 增加服务器
        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");

        // 模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
