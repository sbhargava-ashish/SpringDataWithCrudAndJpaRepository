package com.example.college;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.college.domain.Person;
import com.example.college.domain.Student;
import com.example.college.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudRepositoryDemo {


    @Autowired
    StudentRepository studentRepository;

    @Test
    public void simpleStudentCrudExample() {
        
    		boolean fullTime = true;
       
        studentRepository.save(new Student(new Person("Ashish", "Bhargava"), fullTime, 20));
        studentRepository.save(new Student(new Person("Raj", "Malya"), fullTime, 22));
    
        System.out.println(" --------------- All Students --------------- ");
        
        studentRepository.findAll().forEach(System.out::println);

        
        studentRepository.findAll().forEach(student -> {
            student.setAge(student.getAge() + 1);
            studentRepository.save(student);
        });

        System.out.println(" ---------------  Students a year older --------------- ");
        
        studentRepository.findAll().forEach(System.out::println);

        studentRepository.deleteAll();
        
        System.out.println(" --------------- Students removed --------------- ");
        
        studentRepository.findAll().forEach(System.out::println);

    }


}
