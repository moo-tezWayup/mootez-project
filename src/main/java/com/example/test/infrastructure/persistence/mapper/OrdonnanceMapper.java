package com.example.test.infrastructure.persistence.mapper;

import com.example.test.domain.model.Ordonnance;
import com.example.test.infrastructure.persistence.entity.OrdonnanceEntity;

import java.util.Collections;

import static java.util.Objects.requireNonNull;

public class OrdonnanceMapper {

    // Conversion de l'entité OrdonnanceEntity vers le modèle Ordonnance
    public static Ordonnance toDomain(OrdonnanceEntity ordonnanceEntity) {
        requireNonNull(ordonnanceEntity, "Ordonnance entity should not be null!");

        return Ordonnance.builder()
                .id(ordonnanceEntity.getId()) // ID de l'entité
                .patientId(ordonnanceEntity.getPatientId())
                .medecinId(ordonnanceEntity.getMedecinId())
                .dateOrdonnance(ordonnanceEntity.getDateOrdonnance()) // Date de l'ordonnance
                .medicaments(Collections.singletonList(ordonnanceEntity.getMedicaments()))
                .instructions(ordonnanceEntity.getInstructions())
                // Conversion de dureeTraitement de String en int
                .dureeTraitement(Integer.parseInt(ordonnanceEntity.getDureeTraitement())) // Convertir en int
                .build();
    }

    // Conversion du modèle Ordonnance vers l'entité OrdonnanceEntity
    public static OrdonnanceEntity toEntity(Ordonnance ordonnance) {
        requireNonNull(ordonnance, "Ordonnance model should not be null!");

        return OrdonnanceEntity.builder()
                .id(ordonnance.getId()) // ID de l'ordonnance
                .patientId(ordonnance.getPatientId())
                .medecinId(ordonnance.getMedecinId())
                .dateOrdonnance(ordonnance.getDateOrdonnance()) // Date de l'ordonnance
                .medicaments(String.valueOf(ordonnance.getMedicaments()))
                .instructions(ordonnance.getInstructions())
                // Conversion de dureeTraitement de int en String
                .dureeTraitement(String.valueOf(ordonnance.getDureeTraitement())) // Convertir en String
                .build();
    }
}


