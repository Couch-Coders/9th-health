package com.example.healthteam.controller;

import com.example.healthteam.entity.MachineCategory;
import com.example.healthteam.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("")
    public List<MachineCategory> getCategories() {
        return categoryService.getMachineCategories();
    }
}
