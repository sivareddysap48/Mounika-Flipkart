package com.example.flipkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flipkart.model.FlipkartProduct;
import com.example.flipkart.request.FlipkartRequest;

@Repository
public interface FlipkartDAO extends JpaRepository<FlipkartProduct, Integer>{

}
