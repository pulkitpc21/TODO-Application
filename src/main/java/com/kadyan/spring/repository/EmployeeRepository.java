package com.kadyan.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kadyan.spring.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	 @Query("SELECT p FROM Employee p WHERE p.Firstname LIKE %?1%"
	            + " OR p.Date LIKE %?1%"
	            + " OR p.Priority LIKE %?1%"
	            + " OR CONCAT(p.State, '') LIKE %?1%")
	    public List<Employee> search(String keyword);
}
