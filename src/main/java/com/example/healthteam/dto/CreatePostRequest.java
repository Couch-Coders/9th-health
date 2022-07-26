package com.example.healthteam.dto;

import lombok.Data;

@Data
public class CreatePostRequest {
    String name;
    String title;
    String content;
    String post;
}
