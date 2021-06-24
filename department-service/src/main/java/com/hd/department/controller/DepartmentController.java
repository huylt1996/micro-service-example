package com.hd.department.controller;

import com.hd.department.entity.Department;
import com.hd.department.service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    @Operation(summary = "Save Department")
    public Department saveDepartment(@RequestBody  Department department){
        log.info("Inside save department method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find Department By Id")
    public Department findDepartmentById(@PathVariable("id") Long id){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(id);
    }
}
