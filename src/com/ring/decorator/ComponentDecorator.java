package com.ring.decorator;

/**
 * 构建装饰类
 *
 * @author: the_ring
 * @time: 2022/1/4 14:13
 */
public class ComponentDecorator extends Component {

    /**
     * 维持对抽象构建类型对象的引用
     */
    private final Component component;


    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
