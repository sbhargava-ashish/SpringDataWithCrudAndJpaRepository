package com.example.university;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.university.domain.Department;
import com.example.university.repo.DepartmentRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaRepositoryDemo {
   
	@Autowired
    private DepartmentRepository departmentRepository;
    
	@Test
    public void runJpaRepositoryMethods() {

        departmentRepository.save(new Department("Humanities"));
        departmentRepository.flush();

        departmentRepository.saveAndFlush(new Department("Fine Arts"));

        departmentRepository.save(new Department("Social Science"));

        System.out.println(" ---------------  Departments ---------------");
        departmentRepository.findAll().forEach(System.out::println);

        departmentRepository.deleteInBatch(
                departmentRepository.findAll().subList(0,1));

        System.out.println(" --------------- Less Departments ---------------");
        departmentRepository.findAll().forEach(System.out::println);
        departmentRepository.deleteAllInBatch();
        
        System.out.println(" --------------- Zero Departments ---------------");
        departmentRepository.findAll().forEach(System.out::println);

    }
    @Before
    @After
    public void executeBeforeAndAfter() {
        System.out.println("-------------------------------------------------");
    }
}
