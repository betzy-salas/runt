package com.runt.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.runt.school.entity.Student;
import com.runt.school.entity.Subject;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findBySubject(Subject subject);
}
