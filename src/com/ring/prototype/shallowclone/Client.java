package com.ring.prototype.shallowclone;

/**
 * @projectName: DesignMode
 * @package: com.ring.prototype.shallowclone
 * @className: Client
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/3 16:20
 * @version: 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        WeeklyLog log_previous, log_new;
        // 创建原型对象
        log_previous = new WeeklyLog();
        // 创建附件对象
        Attachment attachment = new Attachment();
        // 将附件添加到周报中
        log_previous.setAttachment(attachment);
        // 调用克隆方法创建克隆对象
        log_new = (WeeklyLog) log_previous.clone();
        // 比较周报
        System.out.println("周报是否相同？ " + (log_previous == log_new));
        // 比较附件
        System.out.println("附件是否相同？ " + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
