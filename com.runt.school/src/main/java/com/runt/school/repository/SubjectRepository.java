package com.runt.school.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.runt.school.entity.Professor;
import com.runt.school.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
    public List<Subject> findByProfessor(Optional<Professor> professor);
}
