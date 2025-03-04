package com.example.test.web.controller;

import com.example.test.application.service.ConsultationService;
import com.example.test.domain.model.Consultation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0/consultations")
@CrossOrigin
public class ConsultationController {
    private final ConsultationService consultationService;

    public ConsultationController(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    @PostMapping("/add")
    public Consultation addConsultation(@RequestBody Consultation consultation) {
        return consultationService.saveConsultation(consultation);
    }

    @GetMapping
    public List<Consultation> getAllConsultations() {
        return consultationService.getAllConsultations();
    }

    @GetMapping("/{id}")
    public Optional<Consultation> getConsultation(@PathVariable String id) {
        return consultationService.getConsultationById(id);
    }
}

