package com.Igor.TransformerSubstPostgresql.service.impl;

import com.Igor.TransformerSubstPostgresql.entities.TransformerSubst;
import com.Igor.TransformerSubstPostgresql.repository.TransformerRepository;
import com.Igor.TransformerSubstPostgresql.service.TransformerRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransformerRepositoryServiceImpl implements TransformerRepositoryService {
    private final TransformerRepository transformerRepository;

    @Autowired
    public TransformerRepositoryServiceImpl(TransformerRepository transformerRepository){
        this.transformerRepository = transformerRepository;
    }

    @Override
    public List<TransformerSubst> getAll() {
        return transformerRepository.findAll();
    }
}
