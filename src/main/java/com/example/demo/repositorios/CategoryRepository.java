package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}