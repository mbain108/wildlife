package com.melissadbain.wildlife.models.data;

import com.melissadbain.wildlife.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

//@Repository
@Transactional
public interface PatientDao extends CrudRepository<Patient, Integer>, JpaRepository<Patient, Integer> {
    List<Patient> findByReason(String reason);
    List<Patient> findBySpeciesName(String speciesName);
    List<Patient> findTop3ByOrderByIdDesc();

    @Query("SELECT COUNT(p) FROM Patient p WHERE datediff(curdate(),p.dateAdmitted)<=7")
    List<Patient> findByDateAdmittedWithinSevenDays();

    Integer countByCaseYear(String caseYear);

    //@Query("SELECT p.speciesName FROM Patient p WHERE p.id = :id")
    //String findSpeciesNameById(@Param("id") Integer id);

}