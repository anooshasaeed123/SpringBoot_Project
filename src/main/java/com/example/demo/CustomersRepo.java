package com.example.demo;

import org.springframework.data.repository.CrudRepository;
//repo is reponsible for working with customer class which have an integer primary key
public interface CustomersRepo extends CrudRepository<customer,Integer>{

}
