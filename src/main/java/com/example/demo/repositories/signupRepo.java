package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Account;
import com.example.demo.model.Member;
import com.example.demo.model.Person;

public interface signupRepo extends JpaRepository<Member,Integer> {


}
