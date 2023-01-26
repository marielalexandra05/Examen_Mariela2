package com.ista.backend.apirest.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter 
@Setter
public class Producto implements Serializable{
	
	 
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "codigo")
	 	@NotNull
	    private Long codigo;

	 	@NotNull
	    @Column(name = "descripcion")
	    @Size(min=5, max=100)
	    private String descripcion;

	    @NotNull
	    @Column(name = "precio")
	    private double precio;

	    @NotNull
	    @Column(name = "cantidad")
	    private Integer cantidad;

		public Long getCodigo() {
			return codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public Integer getCantidad() {
			return cantidad;
		}

		public void setCantidad(Integer cantidad) {
			this.cantidad = cantidad;
		}

		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

		
	    
	    

}
