package com.example.Autogenerate;// src/main/java/com/example/schedulermicroservice/model/DataModel.java

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DataModel {

    @Id
    @Column(unique = true, nullable = false)
    private String id;

    private String name;

    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
