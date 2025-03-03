package com.example.test.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ordonnance {
    private String id;
    private String patientId;
    private String medecinId;
    private LocalDate dateOrdonnance;
    private List<String> medicaments;
    private String instructions;
    private int dureeTraitement;
}


