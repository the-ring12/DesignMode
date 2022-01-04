package com.ring.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:47
 */
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    /**
     * 声明创建迭代器对象的抽象工厂方法
     *
     * @return
     */
    public abstract AbstractIterator createIterator();
}
