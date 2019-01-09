package com.example.javatestb.DAO;

import com.example.javatestb.Entity.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Products,Integer> {

}
