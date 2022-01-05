package com.ring.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息类
 *
 * @author: the_ring
 * @time: 2022/1/5 13:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDao {
    private String account;
    private String password;
    private String telNo;

    public Memento saveMemento() {
        return new Memento(account, password, telNo);
    }

    public void restoreMemento(Memento memento) {
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.telNo = memento.getTelNo();
    }

    public void show() {
        System.out.println("Account: " + this.account);
        System.out.println("Password: " + this.password);
        System.out.println("TelNo: " + this.telNo);
    }
}
