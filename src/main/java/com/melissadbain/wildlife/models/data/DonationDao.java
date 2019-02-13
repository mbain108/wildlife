package com.melissadbain.wildlife.models.data;

import com.melissadbain.wildlife.models.Donation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface DonationDao extends CrudRepository<Donation, Integer> {
}