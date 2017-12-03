package com.example.college;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.college.domain.Person;
import com.example.college.domain.Student;
import com.example.college.repo.StudentPagingAndSortingRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PageAndSortingRepository {


    @Autowired
    StudentPagingAndSortingRepository studentPagingAndSortingRepository;

    @Test
    public void simpleStudentCrudExample() {
        
    		boolean fullTime = true;
       
        studentPagingAndSortingRepository.save(new Student(new Person("Ashish", "Bhargava"), fullTime, 20));
        studentPagingAndSortingRepository.save(new Student(new Person("Raj", "Malya"), fullTime, 22));
    
        System.out.println(" --------------- All Students --------------- ");
        
        studentPagingAndSortingRepository.findAll().forEach(System.out::println);

        
        studentPagingAndSortingRepository.findAll().forEach(student -> {
            student.setAge(student.getAge() + 1);
            studentPagingAndSortingRepository.save(student);
        });

        System.out.println(" ---------------  Students a year older --------------- ");
        
        studentPagingAndSortingRepository.findAll().forEach(System.out::println);

        studentPagingAndSortingRepository.deleteAll();
        
        System.out.println(" --------------- Students removed --------------- ");
        
        studentPagingAndSortingRepository.findAll().forEach(System.out::println);

    }


}
