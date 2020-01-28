package com.example.securityexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.securityexample.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
