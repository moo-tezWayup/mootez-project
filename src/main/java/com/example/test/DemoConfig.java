package com.example.test;

import com.example.test.application.service.PatientService;
import com.example.test.application.usecase.GetListPatientsUseCase;
import com.example.test.application.usecase.GetPatientUseCase;
import com.example.test.application.usecase.SavePatientUseCase;
import com.example.test.domain.repository.PatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public PatientService patientService(SavePatientUseCase savePatientUseCase,
                                         GetListPatientsUseCase getListPatientsUseCase,
                                         GetPatientUseCase getPatientUseCase){
        return new PatientService(savePatientUseCase, getListPatientsUseCase, getPatientUseCase);
    }

    @Bean
    public SavePatientUseCase savePatientUseCase(PatientRepository patientRepository){
        return new SavePatientUseCase(patientRepository);
    }

    @Bean
    public GetListPatientsUseCase getListPatientsUseCase(PatientRepository patientRepository){
        return new GetListPatientsUseCase(patientRepository);
    }

    @Bean
    public GetPatientUseCase getPatientUseCase(PatientRepository patientRepository){
        return new GetPatientUseCase(patientRepository);
    }
}
