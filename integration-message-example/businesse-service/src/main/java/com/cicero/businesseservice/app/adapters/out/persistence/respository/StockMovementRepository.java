package com.cicero.businesseservice.app.adapters.out.persistence.respository;

import com.cicero.businesseservice.app.adapters.out.persistence.entities.StockMovementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StockMovementRepository extends JpaRepository<StockMovementEntity, UUID> {
}
