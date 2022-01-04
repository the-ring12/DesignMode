package com.ring.mediator;


/**
 * 具体中介者类
 *
 * @author: the_ring
 * @time: 2022/1/4 18:14
 */
public class ConcreteMediator extends Mediator {
    /**
     * 维持对各个同事对象的引用
     */
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox comboBox;

    /**
     * 封装同事对象之间的交互
     *
     * @param c
     */
    @Override
    public void componentChanged(Component c) {
        // 单击按钮
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            comboBox.update();
            userNameTextBox.update();
        }
        // 从列表框选择客户
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            comboBox.update();
            userNameTextBox.setText();
        }
        // 从组合框选择客户
        else if (c == comboBox) {
            System.out.println("--从组合框选择客户--");
            comboBox.update();
            userNameTextBox.setText();
        }
    }
}
