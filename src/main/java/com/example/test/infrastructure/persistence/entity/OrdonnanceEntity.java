package com.example.test.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "ordonnance")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdonnanceEntity {

    @Id
    private String id;  // L'ID, généralement une clé primaire unique pour chaque ordonnance

    private String patientId;  // Référence au patient, si vous utilisez des relations entre entités
    private String medecinId;  // Référence au médecin ayant prescrit l'ordonnance

    private LocalDate dateOrdonnance;  // La date de l'ordonnance

    private String medicaments;  // Liste des médicaments prescrits (peut être une chaîne ou un autre type)

    private String instructions;  // Instructions spécifiques pour le traitement

    private String dureeTraitement;  // Durée du traitement, en jours ou autre unité. Vous pouvez la gérer comme String ou Integer selon vos besoins
}


