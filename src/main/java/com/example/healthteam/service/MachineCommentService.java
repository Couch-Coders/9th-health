package com.example.healthteam.service;


import com.example.healthteam.dto.CreateCommentRequest;
import com.example.healthteam.entity.Machine;
import com.example.healthteam.entity.MachineComment;
import com.example.healthteam.repository.MachineCommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MachineCommentService {
    private final MachineCommentRepository commentRepository;
    private final MachineService machineService;

    @Transactional
    public MachineComment createComment(Long machineId, CreateCommentRequest createCommentRequest){
        Machine machine = machineService.getMachineid(machineId);

        MachineComment machineComment = new MachineComment(createCommentRequest.getName(),
                createCommentRequest.getComment(), machine);

        return commentRepository.save(machineComment);
    }
}
