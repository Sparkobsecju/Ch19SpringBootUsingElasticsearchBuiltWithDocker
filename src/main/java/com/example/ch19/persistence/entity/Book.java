package com.example.ch19.persistence.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

@Data
@ToString
@Document(indexName = "book")
public class Book {
    @Id
    private String id; // The type of id must be String
    private String title;
    private String author;
    private String bookConcern;
    private Date publishDate;
    private Float price;
}
