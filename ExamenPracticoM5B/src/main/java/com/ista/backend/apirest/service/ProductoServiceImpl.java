package com.ista.backend.apirest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ista.backend.apirest.modelo.Producto;
import com.ista.backend.apirest.repository.ProductoRepository;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto, Long> implements ProductoService{

	@Autowired
    ProductoRepository productoRepository;
	
	@Override
	public CrudRepository<Producto, Long> getDao() {
		return productoRepository;
	}
}
