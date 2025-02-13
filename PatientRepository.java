package com.healthcare.portal.repository;

import com.healthcare.portal.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can define custom query methods here if needed
}
