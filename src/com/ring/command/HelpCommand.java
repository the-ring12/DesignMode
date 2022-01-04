package com.ring.command;

/**
 * 帮助命令类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:04
 */
public class HelpCommand extends Command {
    /**
     * 维持对请求接收者的引用
     */
    private final DisplayHelpClass displayHelpClass;

    public HelpCommand() {
        displayHelpClass = new DisplayHelpClass();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
