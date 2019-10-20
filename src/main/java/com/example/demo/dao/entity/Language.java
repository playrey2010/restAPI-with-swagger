package com.example.demo.dao.entity;

import javax.persistence.*;

@Entity
public class Language {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    public Language() {
    }


}
