package com.ring.interpreter;

/**
 * 客户端测试类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:39
 */
public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 30";
        InstructionHandler handler = new InstructionHandler();
        handler.handler(instruction);

        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
