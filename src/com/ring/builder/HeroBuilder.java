package com.ring.builder;

/**
 * @projectName: DesignMode
 * @package: com.ring.builder
 * @className: HeroBuilder
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 15:24
 * @version: 1.0
 */
public class HeroBuilder extends AbstractActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
