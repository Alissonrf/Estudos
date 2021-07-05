package br.com.alisson.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.alisson.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "alisson", "898.495.690-89");
	}

	// TIPO 1
	@GetMapping(path = "/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Amarildo", "908.908.890-00");
	}

	// TIPO 2 POREM DESSA VEZ SEGUINDO OS PADROES HTTP
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Joao Pedro", "111.222.333-44");
	}
}
