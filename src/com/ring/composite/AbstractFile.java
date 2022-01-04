package com.ring.composite;

/**
 * @author: the_ring
 * @time: 2022/1/4 13:01
 */
public abstract class AbstractFile {
    /**
     * 添加
     *
     * @param file:
     * @author the_ring
     * @date 2022/1/4 13:03
     */
    public abstract void add(AbstractFile file);

    /**
     * remove
     *
     * @param file:
     * @author the_ring
     * @date 2022/1/4 13:04
     */
    public abstract void remove(AbstractFile file);

    /**
     * getChile
     *
     * @param i:
     * @return AbstractFile
     * @author the_ring
     * @date 2022/1/4 13:04
     */
    public abstract AbstractFile getChild(int i);

    /**
     * killVirus
     *
     * @param :
     * @author the_ring
     * @date 2022/1/4 13:04
     */
    public abstract void killVirus();
}
