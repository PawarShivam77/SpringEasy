package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.Course;
import com.test.repository.CourseRepository;

@RestController
public class MyController {

	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/welcome")
	public String welcome() {
		return" Welcome to single package with Jpa Repository Projects";
	}
	@GetMapping("/new")
	public void name() {
		System.out.println("My Data IS in Project go with different command");
	}
	@PostMapping("/add")
	public Course save(@RequestBody Course course) {
		return courseRepository.save(course);
	}
	@GetMapping("/one/{id}")
	public Course getone(@PathVariable int id) {
		return courseRepository.findById(id).get();
	}

	/*
	 * @GetMapping("/name/{name}") public Course getone(@PathVariable String
	 * coursename) { return courseRepository.findByName(coursename); }
	 */
	@PutMapping("/update/{id}")
	public Course updatedata(@RequestBody Course course,@PathVariable int id) {
		return courseRepository.save(course);
	}
	@GetMapping("/all")
	public List<Course> allcourse() {
		return courseRepository.findAll();
	}
	@DeleteMapping("/del/{id}")
	public void delete(@PathVariable int id) {
		courseRepository.deleteById(id);
	}
	
}
