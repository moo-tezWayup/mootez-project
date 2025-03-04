package com.example.test.application.usecase;

import com.example.test.domain.model.Consultation;
import com.example.test.domain.repository.ConsultationRepository;

import java.util.List;

public class GetAllConsultationsUseCase {
    private final ConsultationRepository consultationRepository;

    public GetAllConsultationsUseCase(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public List<Consultation> execute() {
        return consultationRepository.findAll();
    }
}

