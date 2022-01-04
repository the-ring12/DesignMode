package com.ring.composite;

import java.util.ArrayList;

/**
 * @author: the_ring
 * @time: 2022/1/4 13:09
 */
public class Folder extends AbstractFile {

    /**
     * 定义集合 fileLst，用于存储 AbstractFile 类型的成员
     */
    private final ArrayList<AbstractFile> fileList = new ArrayList<>();
    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        // 模拟杀毒
        System.out.println("----对文件夹‘" + name + "'进行杀毒");

        // 递归调用成员构件的 killVirus() 方法
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
