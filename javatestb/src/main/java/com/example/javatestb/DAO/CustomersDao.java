package com.example.javatestb.DAO;

import com.example.javatestb.Entity.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersDao extends CrudRepository<Customers,Integer> {

}
