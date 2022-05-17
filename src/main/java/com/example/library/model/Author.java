package com.example.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "AUTHORS")
public class Author {
        @Id
        @GeneratedValue
        private int id;
        private String name;
}
