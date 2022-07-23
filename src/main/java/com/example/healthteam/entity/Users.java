package com.example.healthteam.entity;
import lombok.Getter;

import javax.persistence.*;
import java.awt.geom.QuadCurve2D;

@Entity
@Getter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(length=20)
    String name;
    @Column(columnDefinition = "TEXT")
    String area;
    @Column(length=5)
    String age;
    @Column(length=100)
    String email;
    @Column(length=50)
    String password;
    Double height;
    Double weight;

}
