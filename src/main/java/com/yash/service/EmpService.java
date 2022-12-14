package com.yash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.yash.model.Employee;


@Service
public interface EmpService  {

public Employee addEmp(Employee emp);

public List<Employee> getAllEmployee();
public Employee getEmpById(int empid);

public Employee convertToEmployee(Optional<Employee> emp);
public String deleteById(int empid);
public Employee getEmployee(int empid) ;
public Employee update(Employee emp);
}

