package com.ring.builder;

/**
 * @projectName: DesignMode
 * @package: com.ring.builder
 * @className: ActorBuilder
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 15:00
 * @version: 1.0
 */
public abstract class AbstractActorBuilder {

    protected Actor actor = new Actor();

    /**
     * 构造角色类型
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/3 15:14
     */
    public abstract void buildType();

    /**
     * 构造性别
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/3 15:20
     */
    public abstract void buildSex();

    /**
     * 构造脸型
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/3 15:21
     */
    public abstract void buildFace();

    /**
     * 构造服装
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/3 15:21
     */
    public abstract void buildCostume();

    /**
     * 构造发型
     *
     * @param :
     * @return void
     * @author the_ring
     * @date 2022/1/3 15:22
     */
    public abstract void buildHairstyle();

    /**
     * 工厂方法，返回一个完整的游戏角色对象
     *
     * @param :
     * @return Actor
     * @author the_ring
     * @date 2022/1/3 15:23
     */
    public Actor createActor() {
        return actor;
    }
}
