package com.ring.bridge;


/**
 * @author The_ring
 */
public class BmpImage extends AbstractImage {

    @Override
    public void parseFile(String fileName) {
        // 模拟解析 BMP 文件并获得一个像素矩阵对象 m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为 BMP.");
    }
}
