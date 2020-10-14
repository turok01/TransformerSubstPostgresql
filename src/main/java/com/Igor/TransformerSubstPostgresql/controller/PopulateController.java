package com.Igor.TransformerSubstPostgresql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/populate")
public class PopulateController {
   public String PopulateDB(){
       return "success";
   }
}
