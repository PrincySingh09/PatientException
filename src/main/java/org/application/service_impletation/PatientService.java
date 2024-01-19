package org.application.service_impletation;

import java.util.List;
// Add the necessary dependency for javax.persistence
import java.util.NoSuchElementException;
import java.util.Optional;
import org.application.entity.*;
import org.application.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

  @Autowired
  private PatientRepository patientRepository;

  public List<Patient> getAllPatients() {
    List<Patient> patientList = patientRepository.findAll();
    return patientList;
  }

  public Patient savePatient(Patient patient) {
    return patientRepository.save(patient);
  }

  public Patient getPatient(Long id) {
    //
    Patient patient = patientRepository.findByIdOrThrow(id);
    return patient;
  }

  public String deleteById(Long id) {
    patientRepository.deleteById(id);
    return "Deleted Patient with patient id " + id;
  }
}
