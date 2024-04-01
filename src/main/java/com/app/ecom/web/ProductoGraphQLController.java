package com.app.ecom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import com.app.ecom.entities.Producto;

import com.app.ecom.repository.ProductoRepository;

@Controller
public class ProductoGraphQLController {

    @Autowired
    private ProductoRepository productoRepository;
    
    @QueryMapping
    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    
    }

    @QueryMapping
    public Producto buscarProductoById(@Argument String id){
        return productoRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Producto no encontrado"));
    }



}
