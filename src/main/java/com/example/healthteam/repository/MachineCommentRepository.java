package com.example.healthteam.repository;

import com.example.healthteam.entity.MachineCategory;
import com.example.healthteam.entity.MachineComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineCommentRepository extends JpaRepository<MachineComment, Long> {


}
