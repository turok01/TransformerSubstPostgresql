package com.Igor.TransformerSubstPostgresql.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "usertable")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force=true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private final String username;
    private final String password;
}
