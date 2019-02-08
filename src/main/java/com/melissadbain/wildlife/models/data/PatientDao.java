package com.melissadbain.wildlife.models.data;

import com.melissadbain.wildlife.models.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface PatientDao extends CrudRepository<Patient, Integer> {
    //List<Patient> findByReason(String reason);
    List<Patient> findBySpeciesName(String speciesName);
}