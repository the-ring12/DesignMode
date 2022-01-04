package com.ring.composite;

/**
 * @projectName: DesignMode
 * @package: com.ring.composite
 * @className: ImageFile
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 12:50
 * @version: 1.0
 */
public class ImageFile extends AbstractFile {
    private final String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        System.out.println("----对图像文件‘" + name + "'进行杀毒");
    }
}
