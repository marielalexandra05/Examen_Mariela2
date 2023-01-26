package com.ista.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ista.backend.apirest.modelo.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Long>{

}
