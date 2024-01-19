package org.application.repository;
import org.application.entity.Patient;
import org.application.exceptions.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    default Patient findByIdOrThrow(Long id) {
        return findById(id).orElseThrow(() -> new UserNotFoundException("Patient not found"));
    }
    

}
