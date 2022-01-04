package com.ring.bridge;

import com.ring.util.XMLUtil;

/**
 * @projectName: DesignMode
 * @package: com.ring.bridge
 * @className: Client
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 12:16
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractImage image;
        ImageImp imp;
        image = (AbstractImage) XMLUtil.getBean("bridge", "image");
        imp = (ImageImp) XMLUtil.getBean("bridge", "os");
        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
