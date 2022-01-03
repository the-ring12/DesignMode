package com.ring.builder;

/**
 * @projectName: DesignMode
 * @package: com.ring.builder
 * @className: ActorController
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 15:27
 * @version: 1.0
 */
public class ActorController {
    /**
     * 逐步构建复杂产品对象
     *
     * @param builder:
     * @return Actor
     * @author the_ring
     * @date 2022/1/3 15:29
     */
    public Actor construct(AbstractActorBuilder builder) {
        Actor actor;
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        actor = builder.createActor();
        return actor;
    }
}
