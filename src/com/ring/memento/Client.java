package com.ring.memento;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:10
 */
public class Client {
    public static void main(String[] args) {
        UserInfoDao user = new UserInfoDao();
        // 创建负责人
        Caretaker c = new Caretaker();

        user.setAccount("ZhangSan");
        user.setPassword("123456");
        user.setTelNo("1300000000");
        System.out.println("状态一：");
        user.show();
        // 保存备忘录
        c.setMemento(user.saveMemento());
        System.out.println("--------------------------");

        user.setPassword("111111");
        user.setTelNo("131000000");
        System.out.println("状态二：");
        user.show();
        System.out.println("--------------------------");

        // 从备忘录中恢复
        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一：");
        user.show();
        System.out.println("---------------------------");
    }
}
