package com.spring_starter.Springboot_tutorial.service;

import com.spring_starter.Springboot_tutorial.entity.Department;
import com.spring_starter.Springboot_tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

  public  List<Department> fetchDepartmentList();

   Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public  Department fetchDepartmentByName(String departmentName);
}
