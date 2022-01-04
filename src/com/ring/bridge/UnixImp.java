package com.ring.bridge;

/**
 * @projectName: DesignMode
 * @package: com.ring.bridge
 * @className: UnixImp
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 11:53
 * @version: 1.0
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        // 调用 Unix 系统的绘制函数绘制图像
        System.out.println("在 Unix 操作系统中显示图像：");
    }
}
