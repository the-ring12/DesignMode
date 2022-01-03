package com.ring.prototype.deepclone;

import java.io.Serializable;

/**
 * @projectName: DesignMode
 * @package: com.ring.prototype.deepclone
 * @className: Attachment
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 16:25
 * @version: 1.0
 */
public class Attachment implements Serializable {
    /**
     * 附件名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为 " + name);
    }
}
