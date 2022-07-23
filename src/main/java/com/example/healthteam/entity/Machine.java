package com.example.healthteam.entity;
import lombok.Getter;

import javax.persistence.*;
import javax.websocket.Encoder;

@Entity @Getter
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length=20)
    String name;
    @Column(columnDefinition = "TEXT")
    String description;
    @ManyToOne
    MachineCategory machineCategory;
    String videoUrl;
}
