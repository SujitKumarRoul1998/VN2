package com.vn2;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vn2.entity.Courses;
import com.vn2.entity.Student;
import com.vn2.repository.CoursesRepo;
import com.vn2.repository.StudentRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private CoursesRepo coursesRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Courses math=new Courses();
		math.setName("Mathematics");
		
		Courses science=new Courses();
		science.setName("Science");
		
		Courses english=new Courses();
		english.setName("English");
		
		Student s1=new Student();
		s1.setName("Sujit");
		s1.setCourses(new HashSet<>(Set.of(math,science)));
		
		Student s2=new Student();
		s2.setName("Kumar");
		s2.setCourses(new HashSet<>(Set.of(math,english)));
		
		studentRepo.saveAll(Set.of(s1,s2));
		
	}
}
