package com.example.college.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.college.domain.Student;

@Repository
public interface StudentPagingAndSortingRepository extends PagingAndSortingRepository<Student, Integer>{

}
