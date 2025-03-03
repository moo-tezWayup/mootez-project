package com.example.test.domain.repository;

import com.example.test.domain.model.Ordonnance;
import java.util.List;
import java.util.Optional;

public interface OrdonnanceRepository {
    Ordonnance save(Ordonnance ordonnance);
    List<Ordonnance> findAllOrdonnances();
    Optional<Ordonnance> findOrdonnanceById(String id);

    Ordonnance CreateOrdonnance(Ordonnance ordonnance);
}


