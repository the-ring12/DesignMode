package com.ring.decorator;

/**
 * 滚动条装饰类
 *
 * @author: the_ring
 * @time: 2022/1/4 14:29
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
