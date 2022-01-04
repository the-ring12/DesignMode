package com.ring.command;

/**
 * 功能键类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:55
 */
public class FunctionButton {
    /**
     * 维持一个抽象命令对象的引用
     */
    private Command command;

    /**
     * 为功能键注入命令
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 发送请求方法
     */
    public void click() {
        System.out.print("单击功能键：");
        command.execute();
    }
}
