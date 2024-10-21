package com.marco.cad.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.cad.entities.Clientes;
import com.marco.cad.repository.ClientesRepository;


@Service
public class ClientesServices {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> listarTodos() {
        return clientesRepository.findAll();
    }

    public Clientes salvar(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    public void deletar(Long id) {
        clientesRepository.deleteById(id);
    }
}