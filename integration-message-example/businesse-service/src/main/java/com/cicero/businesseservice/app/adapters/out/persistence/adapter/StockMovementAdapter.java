package com.cicero.businesseservice.app.adapters.out.persistence.adapter;

import com.cicero.businesseservice.app.adapters.out.persistence.entities.StockMovementEntity;
import com.cicero.businesseservice.app.adapters.out.persistence.respository.StockMovementRepository;
import com.cicero.businesseservice.app.domains.StockMovement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StockMovementAdapter {

    private final StockMovementRepository stockMovementRepository;

    public List<StockMovement> loadAll() {
        return stockMovementRepository.findAll().stream().map(this::convert).collect(Collectors.toList());
    }

    public StockMovement create(StockMovement stockMovement) {
        StockMovementEntity domain = convert(stockMovement);
        StockMovementEntity save = stockMovementRepository.save(domain);
        return convert(save);
    }

    public StockMovement convert(StockMovementEntity entity) {
        return StockMovement.builder()
                .movementId(entity.getMovmentId())
                .material(entity.getMaterial())
                .movementType(entity.getMovementType())
                .amount(entity.getAmount())
                .location(entity.getLocation())
                .movementDate(entity.getMovementDate())
                .build();
    }

    public StockMovementEntity convert(StockMovement domain) {
        StockMovementEntity stockMovementEntity = new StockMovementEntity();

        stockMovementEntity.setMovmentId(domain.getMovementId());
        stockMovementEntity.setMaterial(domain.getMaterial());
        stockMovementEntity.setMovementType(domain.getMovementType());
        stockMovementEntity.setAmount(domain.getAmount());
        stockMovementEntity.setLocation(domain.getLocation());
        stockMovementEntity.setMovementDate(domain.getMovementDate());

        return stockMovementEntity;
    }
}
