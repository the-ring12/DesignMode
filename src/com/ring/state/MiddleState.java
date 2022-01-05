package com.ring.state;

/**
 * 具体状态类（高手状态类）
 *
 * @author: the_ring
 * @time: 2022/1/5 13:48
 */
public class MiddleState extends AbstractState {
    public MiddleState(AbstractState state) {
        this.account = state.account;
        this.point = state.point;
        this.stateName = "高手";
    }

    @Override
    public void writeNote(int score) {
        System.out.println(account.getName() + "发布留言，增加" + score + "*2个积分。");
        this.point += score * 2;
        checkState(point);
        System.out.println("剩余积分为：" + this.point + "，当前级别为：" + account.getState().stateName + "。");
    }

    @Override
    public void checkState(int score) {
        if (score >= 1000) {
            account.setState(new HighState(this));
        } else if (score < 0) {
            System.out.println("余额不足，文件下载失败！");
            this.point += score;
        } else if (score <= 100) {
            account.setState(new PrimaryState(this));
        }
    }
}
