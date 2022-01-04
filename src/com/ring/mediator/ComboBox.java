package com.ring.mediator;

/**
 * 组合框类
 *
 * @author: the_ring
 * @time: 2022/1/4 18:20
 */
public class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}
