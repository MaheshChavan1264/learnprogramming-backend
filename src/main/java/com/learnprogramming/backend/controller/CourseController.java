package com.learnprogramming.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnprogramming.backend.repository.CoursesRepository;
import com.learnprogramming.backend.model.Course;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/lp/")
public class CourseController {

	@Autowired
	private CoursesRepository coursesRepository;
	
	//get all the course list
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return coursesRepository.findAll();
	}
	
	//add the courses into the databases
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		System.out.println(course);
		return coursesRepository.save(course);
	}
	
	//delete the course by using id
	@PostMapping("/courses/{id}")
	public void deleteCourse(@PathVariable int id){
		courseRepository.deleteById((long) id);
	}
}
