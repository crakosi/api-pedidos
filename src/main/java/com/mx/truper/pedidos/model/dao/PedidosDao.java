package com.mx.truper.pedidos.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.truper.pedidos.model.entity.Pedido;

public interface PedidosDao extends CrudRepository<Pedido,Long> {

}
