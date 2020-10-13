package com.Igor.TransformerSubstPostgresql.service;

import com.Igor.TransformerSubstPostgresql.entities.TransformerSubst;

import java.util.List;

public interface TransformerRepositoryService {
    List<TransformerSubst> getAll();
}
