package com.example.project_manager_ddd.application;

import com.example.project_manager_ddd.UseCase;
import com.example.project_manager_ddd.domain.Project;
import com.example.project_manager_ddd.infrastructure.repository.ProjectEntity;
import com.example.project_manager_ddd.infrastructure.repository.ProjectEntityRepository;
import org.springframework.util.Assert;

import java.util.Date;

@UseCase
public class CreateProjectUseCase {
    private final ProjectEntityRepository projectEntityRepository;

    public CreateProjectUseCase(ProjectEntityRepository projectEntityRepository) {
        this.projectEntityRepository = projectEntityRepository;
    }

    public void execute(String name) {
        Assert.notNull(name, "name must not be null");

        Date currentDate = new Date();
        Project project = new Project(name, currentDate);

        ProjectEntity projectEntity = new ProjectEntity().mapToEntity(project);
        projectEntityRepository.save(projectEntity);
    }
}
