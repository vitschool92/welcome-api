package com.vitech.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitech.demo.model.Employee;
import com.vitech.demo.repo.EmployeeRepo;

@RestController
@RequestMapping("/api/v1")
public class Welcome {
	@Autowired
	private EmployeeRepo  empRepo;
	
	@GetMapping("/welcome")
	public String fetchMessage() {
		return "Hi this is my first api";
		
	}
	@PostMapping("/insert")
	public String postMessage(@RequestBody Employee  empDto) {
		System.out.println("input msg -===="+empDto);
		empRepo.save(empDto);
		String msg = "data inserted sucessfully";
		return msg;
		
	}
	@GetMapping("/fetchemp")
	public List<Employee> fetchAll(){
	return	empRepo.findAll();
	}


}
