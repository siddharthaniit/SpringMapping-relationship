package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Student;

@RepositoryRestResource(collectionResourceRel="student",path="student")
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	Student findByName(@Param("name") String name);

}
