package com.example.test.infrastructure.persistence.repo.jpa;

import com.example.test.domain.model.Consultation;
import com.example.test.domain.repository.ConsultationRepository;
import com.example.test.infrastructure.persistence.entity.ConsultationEntity;
import com.example.test.infrastructure.persistence.mapper.ConsultationMapper;
import com.example.test.infrastructure.persistence.repo.jpa.ConsultationRepo;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ConsultationRepoImpl implements ConsultationRepository {

    private final ConsultationRepo consultationRepo;

    public ConsultationRepoImpl(@Lazy ConsultationRepo consultationRepo) {
        this.consultationRepo = consultationRepo;
    }

    @Override
    public Consultation save(Consultation consultation) {
        // Domaine -> Entité
        ConsultationEntity entity = ConsultationMapper.toEntity(consultation);
        // Persistance
        ConsultationEntity savedEntity = consultationRepo.save(entity);
        // Entité -> Domaine
        return ConsultationMapper.toDomain(savedEntity);
    }

    @Override
    public List<Consultation> findAll() {
        return consultationRepo.findAll().stream()
                .map(ConsultationMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Consultation> findById(String id) {
        return consultationRepo.findById(id)
                .map(ConsultationMapper::toDomain);
    }
}
