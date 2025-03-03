package com.example.test.application.service;

import com.example.test.application.usecase.CreateOrdonnanceUseCase;
import com.example.test.application.usecase.GetListOrdonnancesUseCase;
import com.example.test.application.usecase.GetOrdonnanceUseCase;
import com.example.test.domain.model.Ordonnance;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrdonnanceService {
    private final CreateOrdonnanceUseCase createOrdonnanceUseCase;
    private final GetListOrdonnancesUseCase getListOrdonnancesUseCase;
    private final GetOrdonnanceUseCase getOrdonnanceUseCase;

    public OrdonnanceService(CreateOrdonnanceUseCase createOrdonnanceUseCase,
                             GetListOrdonnancesUseCase getListOrdonnancesUseCase,
                             GetOrdonnanceUseCase getOrdonnanceUseCase) {
        this.createOrdonnanceUseCase = createOrdonnanceUseCase;
        this.getListOrdonnancesUseCase = getListOrdonnancesUseCase;
        this.getOrdonnanceUseCase = getOrdonnanceUseCase;
    }

    public Ordonnance createOrdonnance(Ordonnance ordonnance) {
        return createOrdonnanceUseCase.execute(ordonnance);
    }

    public List<Ordonnance> getListOrdonnances() {
        return getListOrdonnancesUseCase.execute();
    }

    public Optional<Ordonnance> getOrdonnanceById(String id) {
        return getOrdonnanceUseCase.execute(id);
    }
}

