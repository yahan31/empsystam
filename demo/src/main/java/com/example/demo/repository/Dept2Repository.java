package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Dept2;

public interface Dept2Repository extends JpaRepository<Dept2, Integer>{

    Dept2 findByDname(String dname);


    
    
    
}
