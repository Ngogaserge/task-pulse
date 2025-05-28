package com.nserge.taskpulse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String taskName;
    private String taskDescription;
    private String taskStatus;
    private String priority;
    private Date dueDate;
    private Date createdAt;
    private Date updatedAt;

    public Task() {

    }

    public Task(int id, String taskName, String taskDescription, String taskStatus, String priority, Date dueDate, Date createdAt, Date updatedAt) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.priority = priority;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
