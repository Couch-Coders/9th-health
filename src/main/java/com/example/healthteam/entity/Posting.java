package com.example.healthteam.entity;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Posting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(length=30)
    String posterId;
    @Column(columnDefinition = "TEXT")
    String title;
    @Column(columnDefinition = "TEXT")
    String content;
    @Column(columnDefinition = "TEXT")
    String post;

    public Posting(String title, String content, String post) {
        this.title = title;
        this.content = content;
        this.post = post;
    }
}
