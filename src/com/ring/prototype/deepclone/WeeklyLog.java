package com.ring.prototype.deepclone;

import lombok.Data;

import java.io.*;

/**
 * @projectName: DesignMode
 * @package: com.ring.prototype.deepclone
 * @className: WeeklyLog
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 16:27
 * @version: 1.0
 */
@Data
public class WeeklyLog implements Serializable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    /**
     * 使用序列化技术实现深克隆
     *
     * @param :
     * @return WeeklyLog
     * @author the_ring
     * @date 2022/1/3 16:30
     */
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        // 将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }
}
