package com.backendproject.springboot_manytoone.repository;

import com.backendproject.springboot_manytoone.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
