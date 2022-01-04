package com.ring.command;

import com.ring.util.XMLUtil;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:07
 */
public class Client {
    public static void main(String[] args) {
        FunctionButton functionButton = new FunctionButton();
        /**
         * 定义命令对象
         */
        Command command;

        // 读取配置文件，反射生成对象
        command = (Command) XMLUtil.getBean("command");

        // 将命令对象注入功能键
        functionButton.setCommand(command);
        // 调用功能键业务方法
        functionButton.click();
    }
}
