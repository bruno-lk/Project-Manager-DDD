package com.example.project_manager_ddd.domain;

import java.util.Date;
import java.util.UUID;

public class Project {
    private final UUID id;
    private String name;
    private final Date creationDate;
    private Date conclusionDate;
    private Status status;

    public Project(String name, Date creationDate) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.creationDate = creationDate;
        this.status = Status.NEW;
    }

    public void startProject(){
        this.status = Status.ACTIVE;
    }

    public void finishProject(){
        this.conclusionDate = new Date();
        this.status = Status.FINISHED;

    }

    public void renameProject(String newName){
        this.name = newName;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public Status getStatus() {
        return status;
    }
}
