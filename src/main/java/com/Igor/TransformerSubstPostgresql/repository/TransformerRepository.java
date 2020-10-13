package com.Igor.TransformerSubstPostgresql.repository;

import com.Igor.TransformerSubstPostgresql.entities.TransformerSubst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface TransformerRepository extends JpaRepository <TransformerSubst, Integer> {
    List<TransformerSubst> findAll();
}
