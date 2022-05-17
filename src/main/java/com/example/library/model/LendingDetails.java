package com.example.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Data
@Entity
@Table(name = "LENDINGS")
public class LendingDetails {
    @Id
    @GeneratedValue
    private int id;
    private int stoockId;
    private int userId;
    private Date dateOfLending;
    private Date dateOfReturn;
}
