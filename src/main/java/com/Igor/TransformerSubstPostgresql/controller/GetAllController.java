package com.Igor.TransformerSubstPostgresql.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Slf4j
@Controller
@RequestMapping("/getall")
public class GetAllController {

    @Autowired
    private DataSource dataSource;


}
