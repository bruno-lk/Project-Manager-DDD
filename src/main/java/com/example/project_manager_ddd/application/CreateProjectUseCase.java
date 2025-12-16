package com.example.project_manager_ddd.application;

import com.example.project_manager_ddd.UseCase;
import com.example.project_manager_ddd.domain.Project;
import com.example.project_manager_ddd.domain.ProjectRepository;
import com.example.project_manager_ddd.infrastructure.repository.ProjectEntity;
import org.springframework.util.Assert;

import java.util.Date;

@UseCase
public class CreateProjectUseCase {
    private final ProjectRepository projectRepository;

    public CreateProjectUseCase(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void execute(String name) {
        Assert.notNull(name, "name must not be null");

        Date currentDate = new Date();
        Project project = new Project(name, currentDate);

        projectRepository.save(project);
    }
}
