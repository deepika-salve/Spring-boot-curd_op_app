package com.yash.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;






@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer>{
	
}
