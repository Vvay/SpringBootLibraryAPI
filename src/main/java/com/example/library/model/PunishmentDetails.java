package com.example.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PUNISHMENTDETAILS")
public class PunishmentDetails {
    @Id
    @GeneratedValue
    private int id;
    private String details;
    private double prize;
}
