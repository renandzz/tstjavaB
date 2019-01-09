package com.example.javatestb.Controller;

import com.example.javatestb.Entity.Customers;
import com.example.javatestb.Service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController

public class CustomersController {
  @Autowired
  private CustomersService customersService;
  @GetMapping("customer/{id}")
  public ResponseEntity<Customers> getCustomerbyId(@PathVariable("id") Integer id){
    Customers customer = customersService.getCustomersById(id);
    return new ResponseEntity<>(customer, HttpStatus.OK);
  }

//  @PostMapping("customer")
//  public ResponseEntity<Void> saveCustomer(@RequestBody Customers customer, UriComponentsBuilder builder){
//
//  }
}
