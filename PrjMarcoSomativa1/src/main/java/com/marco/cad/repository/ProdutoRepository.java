package com.marco.cad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marco.cad.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
