package com.ring.decorator;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 14:33
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 使用抽象构建定义对象
         */
        Component component, componentSB;
        // 创建具体构建对象
        component = new Window();
        // 创建装饰后的构建对象
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();
    }
}
