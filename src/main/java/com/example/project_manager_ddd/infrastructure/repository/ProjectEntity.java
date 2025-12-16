package com.example.project_manager_ddd.infrastructure.repository;

import com.example.project_manager_ddd.domain.Project;
import com.example.project_manager_ddd.domain.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.UUID;

@Entity
public class ProjectEntity {
    @Id
    private UUID id;
    private String name;
    private Date creationDate;
    private Date conclusionDate;
    private Status status;

    public ProjectEntity() {
    }

    public ProjectEntity(UUID id, String name, Date creationDate, Date conclusionDate, Status status) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.conclusionDate = conclusionDate;
        this.status = status;
    }

    public ProjectEntity mapToEntity(Project project){
        return new ProjectEntity(
                project.getId(),
                project.getName(),
                project.getCreationDate(),
                project.getConclusionDate(),
                project.getStatus());
    }

    public Project mapToDomain(ProjectEntity entity){
        return new Project(
                entity.id,
                entity.creationDate,
                entity.name,
                entity.conclusionDate,
                entity.status);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
