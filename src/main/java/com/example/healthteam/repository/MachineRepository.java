package com.example.healthteam.repository;

import com.example.healthteam.entity.Machine;
import com.example.healthteam.entity.MachineCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MachineRepository extends JpaRepository<Machine, Long> {
    Machine findByName(String name);
    List<Machine> findByMachineCategory(MachineCategory machineCategory);
}
