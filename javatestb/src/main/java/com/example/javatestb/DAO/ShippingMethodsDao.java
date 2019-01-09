package com.example.javatestb.DAO;

import com.example.javatestb.Entity.ShippingMethods;
import org.springframework.data.repository.CrudRepository;

public interface ShippingMethodsDao extends CrudRepository<ShippingMethods,Integer> {

}
