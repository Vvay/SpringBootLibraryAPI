package com.example.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PUNISHMENTS")
public class Punishment {
    @Id
    @GeneratedValue
    private int id;
    private int lendingId;
    private int punishmentCode;
}
