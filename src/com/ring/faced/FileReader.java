package com.ring.faced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件读取器
 *
 * @author: the_ring
 * @time: 2022/1/4 14:56
 */
public class FileReader {

    public String read(String fileName) {
        System.out.print("读取文件，获取明文：");
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            int data;
            while ((data = inputStream.read()) != -1) {
                stringBuffer = stringBuffer.append(data);
            }
            inputStream.close();
            System.out.println(stringBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
