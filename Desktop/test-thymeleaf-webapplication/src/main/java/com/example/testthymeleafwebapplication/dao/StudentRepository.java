package com.example.testthymeleafwebapplication.dao;

import com.example.testthymeleafwebapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
