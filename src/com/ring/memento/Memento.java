package com.ring.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录
 *
 * @author: the_ring
 * @time: 2022/1/5 13:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Memento {
    private String account;
    private String password;
    private String telNo;
}
