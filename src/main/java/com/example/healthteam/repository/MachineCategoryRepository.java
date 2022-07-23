package com.example.healthteam.repository;

import com.example.healthteam.entity.MachineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineCategoryRepository extends JpaRepository<MachineCategory, Integer> {
}
