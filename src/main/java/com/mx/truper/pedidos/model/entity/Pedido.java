package com.mx.truper.pedidos.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido  implements Serializable {
	
	private static final long serialVersionUID = 1366207338875231195L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	
	@Column(name = "nombre_tienda")
	private String nombreTienda;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<DetallePedido> listaPedidos = new HashSet<DetallePedido>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public Set<DetallePedido> getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(Set<DetallePedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

	
	

}
