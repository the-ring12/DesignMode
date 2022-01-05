package com.ring.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 论坛账户类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForumAccount {
    private AbstractState state;
    private String name;

    public ForumAccount(String name) {
        this.name = name;
        this.state = new PrimaryState(this);
        System.out.println(this.name + "注册成功！");
        System.out.println("-----------------------------");
    }

    public void downloadFile(int score) {
        state.downloadFile(score);
    }

    public void writeNote(int score) {
        state.writeNote(score);
    }

    public void replyNote(int score) {
        state.replyNote(score);
    }
}
