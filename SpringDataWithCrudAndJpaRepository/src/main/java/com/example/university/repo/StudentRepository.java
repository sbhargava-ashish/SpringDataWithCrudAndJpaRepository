package com.example.university.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.university.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
	
}
