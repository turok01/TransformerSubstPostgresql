package com.Igor.TransformerSubstPostgresql.entities;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
@Entity
@Table(name="transformersubsts")
public class TransformerSubst implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotBlank(message = "Необходимо указать название подстанции")
    @Column(name = "NAMESUBS")
    private String nameSubst;

    @NotBlank(message = "Необходимо указать IP подстанции")
    private String IP;

    @NotBlank(message = "Необходимо указать зону обслуживания подстанции")
    private String zone;

    @ManyToOne
    private User user;
}
