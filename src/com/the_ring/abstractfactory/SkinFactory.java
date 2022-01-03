package com.the_ring.abstractfactory;

public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
