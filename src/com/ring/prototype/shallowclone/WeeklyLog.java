package com.ring.prototype.shallowclone;

import lombok.Data;

/**
 * @projectName: DesignMode
 * @package: com.ring.prototype.shallowclone
 * @className: WeeklyLog
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 16:17
 * @version: 1.0
 */
@Data
public class WeeklyLog implements Cloneable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
            return obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
