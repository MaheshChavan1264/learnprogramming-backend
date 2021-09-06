package com.learnprogramming.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnprogramming.backend.model.Course;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Long> {

}
