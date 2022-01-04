package com.ring.mediator;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 18:27
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 定义中介者对象
         */
        ConcreteMediator mediator;
        mediator = new ConcreteMediator();

        // 定义同事对象
        Button addBt = new Button();
        List list = new List();
        ComboBox comboBox = new ComboBox();
        TextBox userNameTb = new TextBox();

        addBt.setMediator(mediator);
        list.setMediator(mediator);
        comboBox.setMediator(mediator);
        userNameTb.setMediator(mediator);

        mediator.addButton = addBt;
        mediator.list = list;
        mediator.comboBox = comboBox;
        mediator.userNameTextBox = userNameTb;

        addBt.changed();
        System.out.println("----------------------------------");
        list.changed();
    }
}
