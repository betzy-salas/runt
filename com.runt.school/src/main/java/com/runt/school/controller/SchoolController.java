package com.runt.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.runt.school.dto.ProfessorDTO;
import com.runt.school.service.ProfessorService;

@RestController
public class SchoolController {
	
	@Autowired
	private ProfessorService _professorService;

	@GetMapping("/")
	public @ResponseBody ResponseEntity<String> greetings(){
			return ResponseEntity.status(HttpStatus.OK).body("Hi");
	}
	
	@GetMapping("/professor")
	public @ResponseBody ResponseEntity<ProfessorDTO> findProfessor(@RequestParam Long idProfessor){
		ProfessorDTO professorResponse = _professorService.findProfessor(idProfessor);
		return ResponseEntity.ok().body(professorResponse);
	}
}
