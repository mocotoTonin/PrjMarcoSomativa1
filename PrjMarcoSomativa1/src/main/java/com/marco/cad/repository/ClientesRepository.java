package com.marco.cad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.cad.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}