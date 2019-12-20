package com.ustglobal.springboot.repo;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ustglobal.springboot.dto.EmployeBean;

public interface EmployeeRepo extends JpaRepository<EmployeBean, Integer> {

	
	@Transactional
	@Modifying
	@Query("update EmployeBean set name=:name, password=:password, doj=:doj, gender=:gender where id=:id")
	public void update(@Param("name")String name, @Param("password")String password, @Param("doj")Date doj, @Param("gender")String gender,@Param("id")int id);
	
	//public EmployeBean findByName(String name);

}              