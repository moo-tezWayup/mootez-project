package com.example.test.application.usecase;

import com.example.test.domain.model.Consultation;
import com.example.test.domain.repository.ConsultationRepository;

import java.util.Optional;

public class GetConsultationUseCase {
    private final ConsultationRepository consultationRepository;

    public GetConsultationUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Optional<Consultation> execute(String id) {
        return consultationRepository.findById(id);
    }
}

