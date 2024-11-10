package org.example.lab1_is.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Coordinates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(nullable = false)
    private Float x; //Максимальное значение поля: 448, Поле не может быть null

    @Column(nullable = false)
    private Integer y; //Значение поля должно быть больше -662, Поле не может быть null
}