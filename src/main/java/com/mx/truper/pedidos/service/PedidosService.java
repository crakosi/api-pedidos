package com.mx.truper.pedidos.service;

import java.util.List;

import com.mx.truper.pedidos.model.entity.Pedido;

public interface PedidosService {

	Pedido findById(Long id);
	List<Pedido> findAll();
	Pedido save(Pedido pedido);
}
