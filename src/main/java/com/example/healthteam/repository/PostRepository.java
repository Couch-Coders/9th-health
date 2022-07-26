package com.example.healthteam.repository;

import com.example.healthteam.entity.Posting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posting, Long> {
}
