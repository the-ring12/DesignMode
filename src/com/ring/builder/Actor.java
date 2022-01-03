package com.ring.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: DesignMode
 * @package: com.ring.builder
 * @className: Actor
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 14:53
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Actor {
    /**
     * 角色类型
     */
    private String type;
    /**
     * 性别
     */
    private String sex;
    /**
     * 脸型
     */
    private String face;
    /**
     * 服装
     */
    private String costume;
    /**
     * 发型
     */
    private String hairstyle;
}
