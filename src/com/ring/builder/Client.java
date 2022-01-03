package com.ring.builder;

import com.ring.util.XMLUtil;

/**
 * @projectName: DesignMode
 * @package: com.ring.builder
 * @className: Client
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 15:29
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 针对抽象建造者编程
         */
        AbstractActorBuilder builder;
        // 反射生成具体建造者
        builder = (AbstractActorBuilder) XMLUtil.getBean("builder");

        ActorController actorController = new ActorController();
        Actor actor;
        // 通过指挥者创建完整的建造者对象
        actor = actorController.construct(builder);

        String type = actor.getType();
        System.out.println(type + "外观是: ");
        System.out.println("性别： " + actor.getSex());
        System.out.println("面容： " + actor.getFace());
        System.out.println("服装： " + actor.getCostume());
        System.out.println("发型： " + actor.getHairstyle());
    }

}
