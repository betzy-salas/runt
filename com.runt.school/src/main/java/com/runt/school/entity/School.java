package com.runt.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "school")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdSchool")
    private Long id;
    @Column(name="SchoolName")
    private String schoolName;
}

