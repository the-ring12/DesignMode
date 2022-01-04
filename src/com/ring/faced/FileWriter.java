package com.ring.faced;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件保存类
 *
 * @author: the_ring
 * @time: 2022/1/4 15:24
 */
public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.print("保存密文，写入文件：");
        try {
            FileOutputStream outputStream = new FileOutputStream(fileNameDes);
            outputStream.write(encryptStr.getBytes());
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件操作错误！");
        }
    }
}
