package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
