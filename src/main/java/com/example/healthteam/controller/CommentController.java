package com.example.healthteam.controller;

import com.example.healthteam.dto.CreateCommentRequest;
import com.example.healthteam.entity.MachineComment;
import com.example.healthteam.service.MachineCommentService;
import com.example.healthteam.service.MachineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/machines/{id}/comments")
@AllArgsConstructor
public class CommentController {
    private final MachineCommentService commentService;
    private final MachineService machineService;

    @PostMapping("")
    public MachineComment createComment(@PathVariable("id") Long machineId,
                                        @RequestBody CreateCommentRequest createRequest){
        return commentService.createComment(machineId, createRequest);
    }

    @GetMapping("") //해당 주소를 입력하면 아래 함수 실행 (/machines/{id}/comments)
    public List<MachineComment> getComment(@PathVariable("id") Long machineId) { //{id}의 값을 machineId에 저장
        return commentService.getComment(machineId); //machineId를 통해 댓글 가져오기
    }
}
