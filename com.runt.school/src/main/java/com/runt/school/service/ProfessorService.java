package com.runt.school.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runt.school.dto.ProfessorDTO;
import com.runt.school.dto.StudentDTO;
import com.runt.school.dto.SubjectDTO;
import com.runt.school.entity.Professor;
import com.runt.school.entity.Student;
import com.runt.school.entity.Subject;
import com.runt.school.interfaces.IProfessorService;
import com.runt.school.mapper.SchoolMapper;
import com.runt.school.repository.ProfessorRepository;
import com.runt.school.repository.StudentRepository;
import com.runt.school.repository.SubjectRepository;

@Service
public class ProfessorService implements IProfessorService{

	@Autowired
	ProfessorRepository _professorRepository;
	
	@Autowired
	SubjectRepository _subjectRepository;
	
	@Autowired
	StudentRepository _studentRepository;
	
	@Autowired
	private SchoolMapper _schoolMapper;

	@Override
	public ProfessorDTO findProfessor(Long idProfessor) {
		// TODO Auto-generated method stub
		
		Optional<Professor> professor =  _professorRepository.findById(idProfessor);
		List<SubjectDTO> listSubjects = new ArrayList<SubjectDTO>();
		if(!professor.isEmpty()) {
			List<Subject> subjects =_subjectRepository.findByProfessor(professor);
			if(subjects!=null) {
				
				subjects.forEach((Subject subject) -> {
					List<StudentDTO> listStudents = new ArrayList<StudentDTO>();
					subject.getStudents().forEach((Student student)->{
						listStudents.add(_schoolMapper.studentToDTO(student));
					});
					listSubjects.add(_schoolMapper.subjectToDTO(subject, listStudents));
				});
			}
		}
		return (!professor.isEmpty()? _schoolMapper.professorToDTO(professor.get().getProfessorName(), listSubjects):null);
	}
}
