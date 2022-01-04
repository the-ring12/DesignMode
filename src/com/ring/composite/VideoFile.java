package com.ring.composite;

/**
 * @author: the_ring
 * @time: 2022/1/4 13:04
 */
public class VideoFile extends AbstractFile {
    private final String name;

    public VideoFile(String name) {
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
        System.out.println("----对视频文件‘" + name + "'进行杀毒");
    }
}
