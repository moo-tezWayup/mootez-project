package com.example.test.infrastructure.persistence.repo.jpa;

import com.example.test.domain.model.Ordonnance;
import com.example.test.domain.repository.OrdonnanceRepository;
import com.example.test.infrastructure.persistence.entity.OrdonnanceEntity;
import com.example.test.infrastructure.persistence.mapper.OrdonnanceMapper;
import com.example.test.infrastructure.persistence.repo.jpa.OrdonnanceRepo;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class OrdonnanceRepoImpl implements OrdonnanceRepository {
    private final OrdonnanceRepo ordonnanceRepo;

    public OrdonnanceRepoImpl(@Lazy OrdonnanceRepo ordonnanceRepo) {
        this.ordonnanceRepo = ordonnanceRepo;
    }

    @Override
    public Ordonnance save(Ordonnance ordonnance) {
        // Conversion du modèle domaine en entité, sauvegarde et retour en domaine
        OrdonnanceEntity entity = OrdonnanceMapper.toEntity(ordonnance);
        OrdonnanceEntity savedEntity = ordonnanceRepo.save(entity);
        return OrdonnanceMapper.toDomain(savedEntity);
    }

    @Override
    public List<Ordonnance> findAllOrdonnances() {

        return ordonnanceRepo.findAll()
                .stream()
                .map(OrdonnanceMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Ordonnance> findOrdonnanceById(String id) {

        return ordonnanceRepo.findById(id)
                .map(OrdonnanceMapper::toDomain);
    }

    @Override
    public Ordonnance CreateOrdonnance(Ordonnance ordonnance) {
        return null;
    }
}

