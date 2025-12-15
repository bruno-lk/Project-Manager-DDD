package com.example.project_manager_ddd.infrastructure.api;

import com.example.project_manager_ddd.application.CreateProjectUseCase;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    private final CreateProjectUseCase useCase;

    public ProjectController(CreateProjectUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public void createProject(@RequestBody ProjectRecord body){
        Assert.notNull(body.name, "Name must not be null");
        useCase.execute(body.name);
    }

    record ProjectRecord(String name){};

}
