package com.ring.cor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 采购单类
 *
 * @author: the_ring
 * @time: 2022/1/4 16:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {
    /**
     * 采购金额
     */
    private double amount;
    /**
     * 采购单编号
     */
    private int number;
    /**
     * 采购目的
     */
    private String purpose;
}
