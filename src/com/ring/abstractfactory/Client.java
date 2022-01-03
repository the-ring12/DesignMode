package com.ring.abstractfactory;

import com.ring.util.XMLUtil;

public class Client {
    public static void main(String[] args) {
        // 使用抽象层定义
        SkinFactory factory;
        Button button;
        TextField textField;
        ComboBox comboBox;
        factory = (SkinFactory) XMLUtil.getBean("abstractfactory");
        button = factory.createButton();
        textField = factory.createTextField();
        comboBox = factory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
