package com.ista.backend.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ista.backend.apirest.modelo.Producto;
import com.ista.backend.apirest.service.ProductoService;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	   private ProductoService productoService;

	@GetMapping("/listaProducto")
 public ResponseEntity<List<Producto>> obtenerLista() {
     return new ResponseEntity<>(productoService.findByAll(), HttpStatus.OK);
 }

 @PostMapping("/crearProducto")
 public ResponseEntity<?> createProd (@RequestBody Producto u) {
     return ResponseEntity.status(HttpStatus.CREATED).body(productoService.save(u));
 }

 @GetMapping("/{id}")
 public ResponseEntity<?> readSong (@PathVariable (value = "id") Long id){
     Optional<Producto> oSong = Optional.ofNullable(productoService.findById(id));

     if (!oSong.isPresent()){
         return ResponseEntity.notFound().build();
     }
     return ResponseEntity.ok(oSong);
 }

 @PutMapping("/updateProducto/{id}")
 public ResponseEntity<?> updateProd  (@RequestBody Producto prod, @PathVariable (value = "id") Long id) {
     Optional<Producto> p = Optional.ofNullable(productoService.findById(id));
     if (!p.isPresent()) {
         return ResponseEntity.notFound().build();
     }
         p.get().setCodigo(prod.getCodigo());
         p.get().setDescripcion(prod.getDescripcion());
         p.get().setPrecio(prod.getPrecio());
         p.get().setCantidad(prod.getCantidad());
         
         return ResponseEntity.status(HttpStatus.CREATED).body(productoService.save(p.get()));
 }
 
 @DeleteMapping("/EliminarProducto/{id}")
 public ResponseEntity<?> deleteProd  (@PathVariable (value = "id") Long id) {
	 productoService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
     
     
     
 }
}
