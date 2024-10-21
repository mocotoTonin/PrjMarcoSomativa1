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

import com.marco.cad.entities.Animal;
import com.marco.cad.services.AnimalServices;


@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalServices animalService;

    @GetMapping
    public List<Animal> listar() {
        return animalService.listarTodos();
    }

    @PostMapping
    public Animal adicionar(@RequestBody Animal animal) {
        return animalService.salvar(animal);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        animalService.deletar(id);
    }
}