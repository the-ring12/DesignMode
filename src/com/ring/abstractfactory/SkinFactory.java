package com.ring.abstractfactory;

public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
