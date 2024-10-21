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

import com.marco.cad.entities.Servicos;
import com.marco.cad.services.ServicosServices;


@RestController
@RequestMapping("/servicos")
public class ServicosController {

    @Autowired
    private ServicosServices servicosService;

    @GetMapping
    public List<Servicos> listar() {
        return servicosService.listarTodos();
    }

    @PostMapping
    public Servicos adicionar(@RequestBody Servicos servicos) {
        return servicosService.salvar(servicos);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        servicosService.deletar(id);
    }
}
