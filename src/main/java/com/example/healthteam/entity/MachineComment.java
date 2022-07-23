package com.example.healthteam.entity;
import lombok.Getter;

import javax.persistence.*;

@Entity @Getter
public class MachineComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length=20)
    String name;
    @Column(columnDefinition = "TEXT")
    String comment;
    @ManyToOne
    Machine machine;
}
