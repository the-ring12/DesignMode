package com.ring.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象状态类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractState {
    protected ForumAccount account;
    protected int point;
    protected String stateName;

    /**
     * checkState
     *
     * @param score
     */
    public abstract void checkState(int score);

    public void downloadFile(int score) {
        System.out.println(account.getName() + "下载文件，扣除" + score + "积分。");
        this.point -= score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + account.getState().stateName + "。");
    }

    public void writeNote(int score) {
        System.out.println(account.getName() + "发布留言，增加" + score + "积分。");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + account.getState().stateName + "。");
    }

    public void replyNote(int score) {
        System.out.println(account.getName() + "回复留言，增加" + score + "积分。");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + account.getState().stateName + "。");
    }


}
