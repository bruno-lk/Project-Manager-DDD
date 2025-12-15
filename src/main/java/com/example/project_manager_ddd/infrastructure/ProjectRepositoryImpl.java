package com.example.project_manager_ddd.infrastructure;

import com.example.project_manager_ddd.domain.Project;
import com.example.project_manager_ddd.domain.ProjectRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepositoryImpl implements ProjectRepository {
    private final ProjectEntityRepository projectEntityRepository;

    public ProjectRepositoryImpl(ProjectEntityRepository projectEntityRepository) {
        this.projectEntityRepository = projectEntityRepository;
    }

    @Override
    public void save(Project project) {
        ProjectEntity projectEntity = new ProjectEntity(
                project.getId(),
                project.getName(),
                project.getCreationDate(),
                project.getConclusionDate(),
                project.getStatus());

        projectEntityRepository.save(projectEntity);
    }
}
