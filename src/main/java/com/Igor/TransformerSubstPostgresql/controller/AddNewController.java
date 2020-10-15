package com.Igor.TransformerSubstPostgresql.controller;

import com.Igor.TransformerSubstPostgresql.entities.TransformerSubst;
import com.Igor.TransformerSubstPostgresql.repository.TransformerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/addnew")
public class AddNewController {
    private TransformerRepository transformerRepository;
    @Autowired
    public AddNewController(TransformerRepository transformerRepository){
        this.transformerRepository = transformerRepository;
    }
    @GetMapping
    public String showAddForm(Model model){
        TransformerSubst  transformerSubst = new TransformerSubst();
        model.addAttribute("newSubst",transformerSubst);
        return  "addnew";
    }
    @PostMapping
    public String processAdd(@Valid @ModelAttribute("newSubst") TransformerSubst transformerSubst,
                             Errors errors, Model model){
        if(errors.hasErrors()){
            return "addnew";
        }
        transformerRepository.save(transformerSubst);
        return "success";
    }
}
