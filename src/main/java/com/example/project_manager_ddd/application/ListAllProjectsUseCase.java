package com.example.project_manager_ddd.application;

import com.example.project_manager_ddd.UseCase;
import com.example.project_manager_ddd.domain.Project;
import com.example.project_manager_ddd.domain.ProjectRepository;

import java.util.List;

@UseCase
public class ListAllProjectsUseCase {
    private final ProjectRepository projectRepository;

    public ListAllProjectsUseCase(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> execute() {
        return projectRepository.listAll();
    }
}
