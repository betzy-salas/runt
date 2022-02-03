package com.runt.school.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.runt.school.dto.ProfessorDTO;
import com.runt.school.dto.StudentDTO;
import com.runt.school.dto.SubjectDTO;
import com.runt.school.entity.Student;
import com.runt.school.entity.Subject;

@Component
public class SchoolMapper {
	
	public ProfessorDTO professorToDTO(String professorName, List<SubjectDTO> subjectDTO) {
		return ProfessorDTO.builder().professorName(professorName).subjects(subjectDTO).build();
	}
	
	public StudentDTO studentToDTO(Student student) {
		
		return StudentDTO.builder()
				.studentName(student.getStudentName()).build();
	}
	
	public SubjectDTO subjectToDTO(Subject subject, List<StudentDTO> students) {
		
		return SubjectDTO.builder()
				.subjectName(subject.getNameSubject()).students(students).build();
	}
}
