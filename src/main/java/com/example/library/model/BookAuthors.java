package com.example.library.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "BOOKAUTHORS")
public class BookAuthors {
    @Id
    @GeneratedValue
    private int id;
    private int bookId;
    private int authorId;
}
