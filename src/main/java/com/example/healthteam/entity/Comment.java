package com.example.healthteam.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(length=255)
    String commentComment;
    @Column(length=30)
    String posterId;
    @Column(length=30)
    String postId;
    @Column(columnDefinition = "TEXT")
    String comment;







}
