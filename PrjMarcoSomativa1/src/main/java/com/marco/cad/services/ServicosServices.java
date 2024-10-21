package com.marco.cad.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marco.cad.entities.Servicos;
import com.marco.cad.repository.ServicosRepository;



@Service
public class ServicosServices {

    @Autowired
    private ServicosRepository servicosRepository;

    public List<Servicos> listarTodos() {
        return servicosRepository.findAll();
    }

    public Servicos salvar(Servicos servicos) {
        return servicosRepository.save(servicos);
    }

    public void deletar(Long id) {
        servicosRepository.deleteById(id);
    }
}