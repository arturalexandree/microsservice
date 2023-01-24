package com.mscompra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscompra.model.Pedido;
import com.mscompra.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido salvarPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

}
