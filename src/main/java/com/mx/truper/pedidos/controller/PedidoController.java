package com.mx.truper.pedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.truper.pedidos.model.entity.Pedido;
import com.mx.truper.pedidos.service.PedidosService;

@RestController
@RequestMapping("pedidos")
public class PedidoController {
	
	@Autowired
	private PedidosService pedidoService;
	
	
	@GetMapping("/pedido/{id}")
	public Pedido findById(@PathVariable Long id) {
		return pedidoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Pedido> findAll(){
		return pedidoService.findAll();
	}
	
	@PostMapping("guardar")
	public Pedido save(@RequestBody Pedido pedido) {
		
		return pedidoService.save(pedido);
	}

}
