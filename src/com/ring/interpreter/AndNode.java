package com.ring.interpreter;

/**
 * And 结点类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:12
 */
public class AndNode extends AbstractNode {
    /**
     * And 的左表达式
     */
    private final AbstractNode left;
    /**
     * And 的右表达式
     */
    private final AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    /**
     * And 表达式解释操作
     *
     * @return
     */
    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
