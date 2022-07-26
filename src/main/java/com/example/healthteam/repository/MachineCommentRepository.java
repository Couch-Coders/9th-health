package com.example.healthteam.repository;

import com.example.healthteam.entity.Machine;
import com.example.healthteam.entity.MachineCategory;
import com.example.healthteam.entity.MachineComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MachineCommentRepository extends JpaRepository<MachineComment, Long> {
    List<MachineComment> findByMachine(Machine machine); //Machine 게시물을 통해 Comment를 찾는 함수
}
