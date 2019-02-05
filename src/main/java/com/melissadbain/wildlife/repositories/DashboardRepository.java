package com.melissadbain.wildlife.repositories;

import com.melissadbain.wildlife.models.Patient;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface DashboardRepository extends Repository<Patient, Integer> {
    //List<Patient> findByspecies_nameOrderByspecies_nameAsc(String species_name);
}
