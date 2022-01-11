package com.dailycodebuffer.departement.service;

import com.dailycodebuffer.departement.entity.Department;
import com.dailycodebuffer.departement.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Insdie saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Insdie saveDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
