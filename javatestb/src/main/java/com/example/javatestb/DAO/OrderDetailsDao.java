package com.example.javatestb.DAO;

import com.example.javatestb.Entity.OrderDetails;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailsDao extends CrudRepository<OrderDetails,Integer> {

}
