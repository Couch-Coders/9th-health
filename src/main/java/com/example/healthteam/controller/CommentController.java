package com.example.healthteam.controller;

import com.example.healthteam.dto.CreateCommentRequest;
import com.example.healthteam.entity.MachineComment;
import com.example.healthteam.service.MachineCommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/machines/{id}/comments")
@AllArgsConstructor
public class CommentController {
    private final MachineCommentService commentService;

    @PostMapping("")
    public MachineComment createComment(@PathVariable("id") Long machineId,
                                        @RequestBody CreateCommentRequest createRequest){
        return commentService.createComment(machineId, createRequest);
    }
}
