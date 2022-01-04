package com.ring.iterator;

import java.util.List;

/**
 * 商品数据类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:55
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> objects) {
        super(objects);
    }

    /**
     * 实现创建迭代器对象的具体工厂方法
     *
     * @return
     */
    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
