package com.ring.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 负责人
 *
 * @author: the_ring
 * @time: 2022/1/5 13:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Caretaker {
    private Memento memento;
}
