package com.example.project_manager_ddd.domain;

import java.util.List;

public interface ProjectRepository {
    void save(Project project);
    List<Project> listAll();
}
