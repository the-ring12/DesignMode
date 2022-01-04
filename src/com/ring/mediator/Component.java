package com.ring.mediator;

/**
 * 抽象组件类
 *
 * @author: the_ring
 * @time: 2022/1/4 18:12
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 转发调用
     */
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
