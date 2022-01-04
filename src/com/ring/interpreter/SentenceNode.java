package com.ring.interpreter;

/**
 * 简单句子结点类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:14
 */
public class SentenceNode extends AbstractNode {
    private final AbstractNode direction;
    private final AbstractNode action;
    private final AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    /**
     * 简单句子的解释操作
     *
     * @return
     */
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
