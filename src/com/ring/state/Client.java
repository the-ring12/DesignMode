package com.ring.state;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/5 14:05
 */
public class Client {
    public static void main(String[] args) {
        ForumAccount account = new ForumAccount("张三");
        account.writeNote(20);
        System.out.println("------------------------------");
        account.downloadFile(20);
        System.out.println("-------------------------------");
        account.replyNote(100);
        System.out.println("-------------------------------");
        account.writeNote(40);
        System.out.println("-------------------------------");
        account.downloadFile(80);
        System.out.println("-------------------------------");
        account.downloadFile(150);
        System.out.println("-------------------------------");
        account.writeNote(1000);
        System.out.println("-------------------------------");
        account.downloadFile(80);
        System.out.println("-------------------------------");
    }
}
