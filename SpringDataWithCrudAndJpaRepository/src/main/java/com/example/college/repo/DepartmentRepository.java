package com.example.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.college.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
}
