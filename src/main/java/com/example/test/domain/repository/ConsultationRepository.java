package com.example.test.domain.repository;

import com.example.test.domain.model.Consultation;
import java.util.List;
import java.util.Optional;

public interface ConsultationRepository {
    Consultation save(Consultation consultation);
    List<Consultation> findAll();
    Optional<Consultation> findById(String id);
}

