package com.ring.bridge;

/**
 * @projectName: DesignMode
 * @package: com.ring.bridge
 * @className: WindowsImp
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 11:45
 * @version: 1.0
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        // 调用 Windows 系统的绘制函数绘制像素矩阵
        System.out.println("在 Windows 操作系统中显示图像：");
    }
}
