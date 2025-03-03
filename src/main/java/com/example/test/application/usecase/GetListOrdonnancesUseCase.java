package com.example.test.application.usecase;

import com.example.test.domain.model.Ordonnance;
import com.example.test.domain.repository.OrdonnanceRepository;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class GetListOrdonnancesUseCase {
    private final OrdonnanceRepository ordonnanceRepository;

    public GetListOrdonnancesUseCase(OrdonnanceRepository ordonnanceRepository) {
        this.ordonnanceRepository = ordonnanceRepository;
    }

    public List<Ordonnance> execute() {
        return ordonnanceRepository.findAllOrdonnances();
    }
}


