package com.example.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.College;

@RepositoryRestResource(collectionResourceRel="college",path = "college")
public interface CollegeRepository extends CrudRepository<College, Integer>{
	
   College findByName(@Param("name") String name);
   
  /* @Modifying
   @Query("update College u set u.name = ?1, u.address = ?2 where u.id = ?3")
   void setUserInfoById(String name, String a, Integer id);
*/

}
