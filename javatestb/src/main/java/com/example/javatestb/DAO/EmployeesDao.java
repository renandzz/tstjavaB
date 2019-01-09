package com.example.javatestb.DAO;

import com.example.javatestb.Entity.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesDao extends CrudRepository<Employees, Integer> {

}
