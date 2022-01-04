package com.ring.composite;

/**
 * @author: the_ring
 * @time: 2022/1/4 13:08
 */
public class TextFile extends AbstractFile {
    private final String name;

    public TextFile(String name) {
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
        System.out.println("----对文本文件‘" + name + "'进行杀毒");
    }
}
