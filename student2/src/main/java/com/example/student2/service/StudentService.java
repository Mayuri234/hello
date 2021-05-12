package com.example.student2.service;

	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.student2.dao.StudentDao;
   import com.example.student2.model.Student;
	@Service
	public class StudentService {
		
		@Autowired
		private StudentDao dao;
		
		public Student create(Student student) {
			return dao.save(student);
		}
		
		public Iterable<Student> getAllStudents(){
			return dao.findAll();
		}
		
		public Iterable<Student> pagination( Integer pageNo){
			Pageable pagable = PageRequest.of(pageNo, 3);
			
		
			return dao.findAll(pagable);
		}
		
		public Iterable<Student> pagiantionByNumber(){
			
			return dao.findAll(PageRequest.of(0, 3));
		}

	}



