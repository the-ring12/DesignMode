package com.ring.interpreter;

/**
 * 动作结点
 *
 * @author: the_ring
 * @time: 2022/1/4 17:22
 */
public class ActionNode extends AbstractNode {
    private final String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if ("move".equals(action)) {
            return "移动";
        } else if ("run".equals(action)) {
            return "快速移动";
        } else {
            return "无效指令";
        }
    }
}
