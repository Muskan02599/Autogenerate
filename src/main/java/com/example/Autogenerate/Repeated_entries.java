package com.example.Autogenerate;// src/main/java/com/example/schedulermicroservice/model/DataModel.java

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Repeated_entries {


    @Id
    @GeneratedValue
    private int number;
    @Column
    private String id;

    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
