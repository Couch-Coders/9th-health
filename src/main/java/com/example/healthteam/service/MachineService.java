package com.example.healthteam.service;

import com.example.healthteam.entity.Machine;
import com.example.healthteam.entity.MachineCategory;
import com.example.healthteam.repository.MachineCategoryRepository;
import com.example.healthteam.repository.MachineRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MachineService {
    private final MachineRepository machineRepository;
    private final MachineCategoryRepository machineCategoryRepository;

    public List<Machine> getMachines(){
        return machineRepository.findAll();
    }

    public List<Machine> getMachinesByCategory(Integer categoryId){
        MachineCategory machineCategory = machineCategoryRepository.findById(categoryId).get();
        return machineRepository.findByMachineCategory(machineCategory);
    }
}
