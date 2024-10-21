package com.marco.cad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.cad.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}