package com.luv2code.springboot.bootcruddatarest.dao;

import com.luv2code.springboot.bootcruddatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="emps")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
