package com.runt.school.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subject")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdSubject")
	private Long id;
	@Column(name="NameSubject")
	private String nameSubject;
	
	@ManyToOne
	@JoinColumn(name = "idCourse")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="IdProfessor")
	private Professor professor;
	
	@ManyToMany(mappedBy = "subject")
	 private Set<Student> students;
	 

}
