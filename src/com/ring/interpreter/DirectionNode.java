package com.ring.interpreter;

/**
 * 方向结点类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:19
 */
public class DirectionNode extends AbstractNode {
    private final String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if ("up".equals(direction)) {
            return "向上";
        } else if ("down".equals(direction)) {
            return "向下";
        } else if ("left".equals(direction)) {
            return "向左";
        } else if ("right".equals(direction)) {
            return "向右";
        } else {
            return "无效指令";
        }
    }
}
