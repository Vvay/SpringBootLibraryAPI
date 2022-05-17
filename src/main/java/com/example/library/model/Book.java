package com.example.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String title;
}
