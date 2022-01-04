package com.ring.interpreter;

import java.util.Stack;

/**
 * 指令处理类
 *
 * @author: the_ring
 * @time: 2022/1/4 17:25
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handler(String instruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        // 声明一个栈对象用于存储抽象语法树
        Stack<AbstractNode> stack = new Stack<>();
        // 以空格分隔指令字符串
        String[] words = instruction.split(" ");
        for (int i = 0; i < words.length; i++) {
            /**
             * 本实例采用栈的方式处理指令，
             * 如果遇到”and",则将其后的3个终结符表达式连成一个简单的句子 SentenceNode 作为 "and" 的右表达式，
             * 而将栈顶弹出的表达式作为 "and" 的左表达式，
             * 最后将新的 "and" 表达式压入栈中
             */
            if ("and".equalsIgnoreCase(words[i])) {
                // 弹出栈顶表达式作为左表达式
                left = stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                // 右表达式
                right = new SentenceNode(direction, action, distance);
                // 将新表达式压入栈中
                stack.push(new AndNode(left, right));
            }
            /**
             * 如果是从头开始进行解释，则将前3个单词组成一个简单的句子 SentenceNode 并将该句子压入栈中
             */
            else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        // 将全部表达式从栈中弹出
        this.node = stack.pop();
    }

    public String output() {
        // 解释表达式
        return node.interpret();
    }
}
