package com.example.healthteam.service;

import com.example.healthteam.entity.MachineCategory;
import com.example.healthteam.repository.MachineCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final MachineCategoryRepository machineCategoryRepository;

    public List<MachineCategory> getMachineCategories() {
        return machineCategoryRepository.findAll();
    }
}
