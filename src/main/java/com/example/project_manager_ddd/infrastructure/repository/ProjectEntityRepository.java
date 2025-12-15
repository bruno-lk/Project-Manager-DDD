package com.example.project_manager_ddd.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectEntityRepository extends JpaRepository<ProjectEntity, UUID> {
}
