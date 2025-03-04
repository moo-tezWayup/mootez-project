package com.example.test.domain.model;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Consultation {
    private String id;
    private String patientId;
    private String doctorId;
    private LocalDateTime date;
    private String notes;
}
