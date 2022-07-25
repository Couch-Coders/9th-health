package com.example.healthteam.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity @Getter
@NoArgsConstructor
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

    public MachineComment(String name, String comment, Machine machine){
        this.name = name;
        this.comment = comment;
        this.machine = machine;
    }
}
