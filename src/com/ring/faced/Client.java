package com.ring.faced;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 15:32
 */
public class Client {

    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("src/com/ring/faced/a.txt", "src/com/ring/faced/b.txt");
    }
}
