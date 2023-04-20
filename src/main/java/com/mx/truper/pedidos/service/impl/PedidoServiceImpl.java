package com.mx.truper.pedidos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.truper.pedidos.model.dao.PedidosDao;
import com.mx.truper.pedidos.model.entity.Pedido;
import com.mx.truper.pedidos.service.PedidosService;

@Service
public class PedidoServiceImpl implements PedidosService{
	
	@Autowired
	PedidosDao pedidoDao;

	@Transactional(readOnly = true)
	@Override
	public Pedido findById(Long id) {
		
		return pedidoDao.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Pedido> findAll() {
		
		return (List<Pedido>) pedidoDao.findAll();
	}

	@Transactional
	@Override
	public Pedido save(Pedido pedido) {
		return pedidoDao.save(pedido);
		
	}

}
