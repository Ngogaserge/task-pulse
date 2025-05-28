package com.nserge.taskpulse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String color;
    private String createdAt;
    private String updatedAt;

    public Project() {

    }

    public Project(int id, String name, String description, String color, String createdAt, String updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
