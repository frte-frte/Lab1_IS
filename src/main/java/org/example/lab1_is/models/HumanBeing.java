package org.example.lab1_is.models;

import org.example.lab1_is.models.enums.Mood;
import org.example.lab1_is.models.enums.WeaponType;

public class HumanBeing {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Boolean realHero; //Поле не может быть null
    private boolean hasToothpick;
    private Car car; //Поле может быть null
    private Mood mood; //Поле может быть null
    private Double impactSpeed; //Поле не может быть null
    private String soundtrackName; //Поле не может быть null
    private WeaponType weaponType; //Поле не может быть null
}
