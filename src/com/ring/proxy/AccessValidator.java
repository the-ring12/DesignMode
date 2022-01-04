package com.ring.proxy;

/**
 * 身份验证类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:06
 */
public class AccessValidator {
    /**
     * 模拟实现登陆验证
     *
     * @param userId
     * @return
     */
    public boolean validate(String userId) {
        System.out.println("在数据库中验证用户’" + userId + "'是否为合法用户？");
        if ("杨过".equals(userId)) {
            System.out.println("'" + userId + "'登陆成功！");
            return true;
        } else {
            System.out.println("'" + userId + "'登陆失败！");
            return false;
        }
    }
}
