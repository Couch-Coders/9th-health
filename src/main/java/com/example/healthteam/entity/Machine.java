package com.example.healthteam.entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.websocket.Encoder;

@Entity @Getter
@NoArgsConstructor
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

    public Machine(String name, String description, String videoUrl){
        this.name = name;
        this.description = description;
        this.videoUrl = videoUrl;
    }
}
