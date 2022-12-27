package com.example.learnnewwords.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class TestModel {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public TestModel(String test) {
        this.name = test;
    }
}
