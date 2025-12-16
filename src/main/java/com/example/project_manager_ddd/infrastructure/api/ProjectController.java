package com.example.project_manager_ddd.infrastructure.api;

import com.example.project_manager_ddd.application.CreateProjectUseCase;
import com.example.project_manager_ddd.application.ListAllProjectsUseCase;
import com.example.project_manager_ddd.domain.Project;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    private final CreateProjectUseCase createProjectUseCase;
    private final ListAllProjectsUseCase listAllProjectsUseCase;

    public ProjectController(CreateProjectUseCase createProjectUseCase, ListAllProjectsUseCase listAllProjectsUseCase) {
        this.createProjectUseCase = createProjectUseCase;
        this.listAllProjectsUseCase = listAllProjectsUseCase;
    }

    @PostMapping
    public void createProject(@RequestBody ProjectRecord body){
        Assert.notNull(body.name, "Name must not be null");
        createProjectUseCase.execute(body.name);
    }

    @GetMapping
    public List<Project> listAll(){
        return listAllProjectsUseCase.execute();
    }

    record ProjectRecord(String name){};

}
