package com.example.test.application.usecase;

import com.example.test.domain.model.Ordonnance;
import com.example.test.domain.repository.OrdonnanceRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateOrdonnanceUseCase {
    private final OrdonnanceRepository ordonnanceRepository;

    public CreateOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository) {
        this.ordonnanceRepository = ordonnanceRepository;
    }

    public Ordonnance execute(Ordonnance ordonnance) {
        return ordonnanceRepository.CreateOrdonnance(ordonnance);
    }
}


