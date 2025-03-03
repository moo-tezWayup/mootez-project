package com.example.test.infrastructure.persistence.repo.jpa;

import com.example.test.infrastructure.persistence.entity.OrdonnanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdonnanceRepo extends JpaRepository<OrdonnanceEntity, String> {

}

