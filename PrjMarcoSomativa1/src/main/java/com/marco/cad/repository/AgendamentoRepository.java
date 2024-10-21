package com.marco.cad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.cad.entities.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}