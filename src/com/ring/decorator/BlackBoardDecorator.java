package com.ring.decorator;

/**
 * 黑色边框装饰类
 *
 * @author: the_ring
 * @time: 2022/1/4 14:31
 */
public class BlackBoardDecorator extends ComponentDecorator {
    public BlackBoardDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBoard();
        super.display();
    }

    public void setBlackBoard() {
        System.out.println("为构建添加黑色边框！");
    }
}
