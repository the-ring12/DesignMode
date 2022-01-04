package com.ring.command;

/**
 * 退出命令类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:58
 */
public class ExitCommand extends Command {
    /**
     * 维持对请求接收者的引用
     */
    private final SystemExitClass systemExitClass;

    public ExitCommand() {
        systemExitClass = new SystemExitClass();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
