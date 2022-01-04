package com.ring.bridge;

/**
 * @projectName: DesignMode
 * @package: com.ring.bridge
 * @className: PngImage
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 12:01
 * @version: 1.0
 */
public class PngImage extends AbstractImage {

    @Override
    public void parseFile(String fileName) {
        // 模拟解析 PNG 文件并获得一个像素矩阵对象 m
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为 PNG.");
    }
}
