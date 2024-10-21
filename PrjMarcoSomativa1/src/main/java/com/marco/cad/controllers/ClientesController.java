package com.marco.cad.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marco.cad.entities.Clientes;
import com.marco.cad.services.ClientesServices;


@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesServices clientesService;

    @GetMapping
    public List<Clientes> listar() {
        return clientesService.listarTodos();
    }

    @PostMapping
    public Clientes adicionar(@RequestBody Clientes clientes) {
        return clientesService.salvar(clientes);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        clientesService.deletar(id);
    }
}
    