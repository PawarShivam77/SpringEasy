package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

	//Course findByName(String coursename);
}
