package com.ring.interpreter;

/**
 * 距离结点类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:24
 */
public class DistanceNode extends AbstractNode {
    private final String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    /**
     * 距离表达式的解释操作
     *
     * @return
     */
    @Override
    public String interpret() {
        return this.distance;
    }
}
