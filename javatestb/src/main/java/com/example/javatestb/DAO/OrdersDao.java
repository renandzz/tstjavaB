package com.example.javatestb.DAO;

import com.example.javatestb.Entity.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersDao extends CrudRepository<Orders,Integer> {

}
