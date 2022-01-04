package com.ring.bridge;

/**
 * @projectName: DesignMode
 * @package: com.ring.bridge
 * @className: JPGImage
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 11:57
 * @version: 1.0
 */
public class JpgImage extends AbstractImage {


    @Override
    public void parseFile(String fileName) {
        // 模拟解析 JPG 文件并获得一个像素矩阵对象 m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为 JPG.");
    }
}
