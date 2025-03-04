package com.example.test.application.usecase;

import com.example.test.domain.model.Consultation;
import com.example.test.domain.repository.ConsultationRepository;

public class CreateConsultationUseCase {
    private final ConsultationRepository consultationRepository;

    public CreateConsultationUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation execute(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}

