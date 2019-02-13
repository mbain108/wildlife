package com.melissadbain.wildlife.models.data;

import com.melissadbain.wildlife.models.Rescuer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface RescuerDao extends CrudRepository<Rescuer, Integer> {
}