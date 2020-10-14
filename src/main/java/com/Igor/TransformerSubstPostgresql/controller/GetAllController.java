package com.Igor.TransformerSubstPostgresql.controller;

import com.Igor.TransformerSubstPostgresql.entities.TransformerSubst;
import com.Igor.TransformerSubstPostgresql.repository.TransformerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/getall")
public class GetAllController {

    private TransformerRepository transformerRepository;

    @Autowired
    public GetAllController(TransformerRepository transformerRepository){
        this.transformerRepository = transformerRepository;
    }
    @GetMapping
    public String showGetAllForm(Model model){
        List<TransformerSubst> substs = new ArrayList<>();
        transformerRepository.findAll().forEach(i->substs.add(i));
        model.addAttribute("listsubst",substs);
        return "getAll";
    }



}
