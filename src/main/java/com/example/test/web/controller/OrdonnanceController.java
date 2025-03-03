package com.example.test.web.controller;

import com.example.test.application.service.OrdonnanceService;
import com.example.test.domain.model.Ordonnance;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v0")
@CrossOrigin
public class OrdonnanceController {
    private final OrdonnanceService ordonnanceService;

    public OrdonnanceController(OrdonnanceService ordonnanceService) {
        this.ordonnanceService = ordonnanceService;
    }

    @PostMapping("/addOrdonnance")
    public Ordonnance createOrdonnance(@RequestBody Ordonnance ordonnance) {
        return ordonnanceService.createOrdonnance(ordonnance);
    }

    @GetMapping("/ordonnances")
    public List<Ordonnance> getListOrdonnances() {
        return ordonnanceService.getListOrdonnances();
    }

    @GetMapping("/{id}")
    public Optional<Ordonnance> getOrdonnance(@PathVariable String id) {
        return ordonnanceService.getOrdonnanceById(id);
    }
}
