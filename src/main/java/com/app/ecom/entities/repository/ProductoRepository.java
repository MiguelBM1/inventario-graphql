package com.app.ecom.entities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecom.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String>{
    

}
