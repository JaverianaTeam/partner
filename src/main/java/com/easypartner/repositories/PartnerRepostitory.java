package com.easypartner.repositories;

import com.easypartner.entities.PartnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartnerRepostitory extends JpaRepository<PartnerEntity, Integer>{
}
