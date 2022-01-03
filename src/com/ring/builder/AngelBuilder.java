package com.ring.builder;

/**
 * @projectName: DesignMode
 * @package: com.ring.builder
 * @className: AngelBuilder
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 15:26
 * @version: 1.0
 */
public class AngelBuilder extends AbstractActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
