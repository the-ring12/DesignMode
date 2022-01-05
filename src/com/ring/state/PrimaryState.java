package com.ring.state;

/**
 * 具体状态类（新手状态类）
 *
 * @author: the_ring
 * @time: 2022/1/5 13:42
 */
public class PrimaryState extends AbstractState {
    public PrimaryState(AbstractState state) {
        this.account = state.account;
        this.point = state.point;
        this.stateName = "新手";
    }

    public PrimaryState(ForumAccount account) {
        this.point = 0;
        this.account = account;
        this.stateName = "新手";
    }

    @Override
    public void downloadFile(int score) {
        System.out.println("对不起，" + account.getName() + "，您没有下载文件的权限！");
    }

    @Override
    public void checkState(int score) {
        if (score >= 1000) {
            account.setState(new HighState(this));
        } else if (score >= 100) {
            account.setState(new MiddleState(this));
        }
    }
}
