package com.example.test.application.usecase;

import com.example.test.domain.model.Ordonnance;
import com.example.test.domain.repository.OrdonnanceRepository;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class GetOrdonnanceUseCase {
    private final OrdonnanceRepository ordonnanceRepository;

    public GetOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository) {
        this.ordonnanceRepository = ordonnanceRepository;
    }

    public Optional<Ordonnance> execute(String id) {
        return ordonnanceRepository.findOrdonnanceById(id);
    }
}


