package com.example.healthteam.service;

import com.example.healthteam.dto.CreatePostRequest;
import com.example.healthteam.entity.Posting;
import com.example.healthteam.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional //예외 처리를 해줌 ?
    public Posting createPost(CreatePostRequest createRequest) { //게시물의 데이터를 받아옴
        //데이터에 따라 posting 객체 생성
        Posting post = new Posting(createRequest.getTitle(), createRequest.getContent(), createRequest.getPost());

        //생성한 객체 저장
        return postRepository.save(post);
     }

     public List<Posting> getPosts() {
        return postRepository.findAll(); //모든 게시물 가져오기
     }
}
