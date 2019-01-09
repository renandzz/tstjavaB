package com.example.javatestb.Service;

import com.example.javatestb.DAO.CustomersDao;
import com.example.javatestb.Entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {

  @Autowired
  private CustomersDao customersDao;

  public Customers getCustomersById(int customersId) {
    Customers obj = customersDao.findById(customersId).get();
    return obj;
  }

  public synchronized boolean saveCustomer(Customers input) {
      customersDao.save(input);
      return true;

  }
}
