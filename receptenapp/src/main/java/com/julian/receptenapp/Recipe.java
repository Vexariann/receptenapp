package com.julian.receptenapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Recipe {
    @GeneratedValue
    @Id
    long Id;

    String title;

    public Recipe(){};

    public Recipe(String title) {
        this.title = title;
    }
}
