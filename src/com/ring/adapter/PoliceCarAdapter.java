package com.ring.adapter;

/**
 * @projectName: DesignMode
 * @package: com.ring.adapter
 * @className: PoliceCarAdapter
 * @author: the_ring
 * @description: TODO
 * @date: 2022/1/4 11:09
 * @version: 1.0
 */
public class PoliceCarAdapter extends CarController {
    private final PoliceSound sound;
    private final PoliceLamp lamp;

    public PoliceCarAdapter() {
        this.sound = new PoliceSound();
        this.lamp = new PoliceLamp();
    }

    @Override
    public void sound() {
        // 调用适配者类 PoliceSound 的方法
        sound.alarmSound();
    }

    @Override
    public void light() {
        // 调用适配者类 PoliceLamp 的方法
        lamp.alarmLamp();
    }
}
