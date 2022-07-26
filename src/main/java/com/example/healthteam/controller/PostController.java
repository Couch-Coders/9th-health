package com.example.healthteam.controller;

import com.example.healthteam.dto.CreatePostRequest;
import com.example.healthteam.entity.Posting;
import com.example.healthteam.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController           //Controller
@RequestMapping("/posts") //해당 주소 입력시 아래 클래스 실행
@AllArgsConstructor       //생성자 자동 생성?
public class PostController {
    private final PostService postService;

    @PostMapping("")
    public Posting createPost(@RequestBody CreatePostRequest createRequest) { //작성한 게시물의 데이터를 createRequest에 저장
        return postService.createPost(createRequest);
    }

    @GetMapping("")
    public List<Posting> getPosts() {
        return postService.getPosts();
    }
}
