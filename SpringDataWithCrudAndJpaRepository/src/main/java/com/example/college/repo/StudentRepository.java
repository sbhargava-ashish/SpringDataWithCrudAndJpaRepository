package com.example.college.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.college.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
}
