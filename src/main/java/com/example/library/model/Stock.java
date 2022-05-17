package com.example.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "STOCK")
public class Stock {
    @Id
    @GeneratedValue
    private int id;
    private int bookId;
    private boolean availability;
}
