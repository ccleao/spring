package com.cicero.businesseservice.app.services;

import com.cicero.businesseservice.app.adapters.in.rest.dtos.StockMovementDTO;
import com.cicero.businesseservice.app.adapters.out.persistence.adapter.StockMovementAdapter;
import com.cicero.businesseservice.app.domains.StockMovement;
import com.cicero.businesseservice.app.domains.enums.MovementTypeEnum;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class StockMovementService {
    private final StockMovementAdapter stockMovementAdapter;

    public List<StockMovement> findAll() {
        return stockMovementAdapter.loadAll();
    }

    public StockMovement create(StockMovementDTO stockMovementDTO) {

        StockMovement stockMovement = StockMovement.builder()
                .movementId(stockMovementDTO.getMovementId())
                .material(stockMovementDTO.getMaterial())
                .movementType(MovementTypeEnum.valueOfEnum(stockMovementDTO.getMovementType()))
                .amount(stockMovementDTO.getAmount())
                .location(stockMovementDTO.getLocation())
                .movementDate(stockMovementDTO.getMovementDate())
                .build();

        return stockMovementAdapter.create(stockMovement);
    }
}
