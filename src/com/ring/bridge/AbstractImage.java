package com.ring.bridge;

/**
 * @projectName: DesignMode
 * @package: com.ring.bridge
 * @className: Image
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 11:54
 * @version: 1.0
 */
public abstract class AbstractImage {
    protected ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    /**
     * 图像转换为矩阵
     *
     * @param fileName:
     * @author the_ring
     * @date 2022/1/4 11:56
     */
    public abstract void parseFile(String fileName);
}
