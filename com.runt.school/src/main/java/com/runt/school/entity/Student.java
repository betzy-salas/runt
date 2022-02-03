package com.runt.school.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdStudent")
	private Long id;
	@Column(name="StudentName")
	private String studentName;
	
	@ManyToMany
	@JoinTable(
	  name = "subject_student", 
	  joinColumns = @JoinColumn(name = "IdStudent"), 
	  inverseJoinColumns = @JoinColumn(name = "IdSubject"))
    private Set<Subject> subject;

}

