package com.ring.faced;

/**
 * 数据加密类
 *
 * @author: the_ring
 * @time: 2022/1/4 15:05
 */
public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.print("数据家吗，将明文转换为密文：");
        String es = "";
        for (int i = 0; i < plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
