package org.example.lab1_is.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.lab1_is.models.enums.Mood;
import org.example.lab1_is.models.enums.WeaponType;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class HumanBeing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    @Column(nullable = false)
    private String name; //Поле не может быть null, Строка не может быть пустой

    @ManyToOne(optional = false)
    @JoinColumn(name = "coordinates_id", nullable = false)
    private Coordinates coordinates; //Поле не может быть null

    @Column(nullable = false, updatable = false)
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    @Column(nullable = false)
    private Boolean realHero; //Поле не может быть null

    @Column(nullable = false)
    private boolean hasToothpick;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car; //Поле может быть null

    @Enumerated(EnumType.STRING)
    private Mood mood; //Поле может быть null

    @Column(nullable = false)
    private Double impactSpeed; //Поле не может быть null

    @Column(nullable = false)
    private String soundtrackName; //Поле не может быть null

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private WeaponType weaponType; //Поле не может быть null
}
