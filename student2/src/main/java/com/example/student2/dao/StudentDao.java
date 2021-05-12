package com.example.student2.dao;

	import org.springframework.data.jpa.repository.JpaRepository;

    import com.example.student2.model.Student;

	
	public interface StudentDao extends JpaRepository<Student, Integer>{
		
		
	}



