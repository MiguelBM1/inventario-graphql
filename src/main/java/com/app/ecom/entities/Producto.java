package com.app.ecom.entities;

import java.util.Locale;

import com.github.javafaker.Faker;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {

    @Id
    private String id;
    
    private String nombre;

    private double precio;

    private int cantidad;

    @ManyToOne
    private Categoria categoria;


}
