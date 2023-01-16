package com.cicero.businesseservice.app.adapters.in.rest;


import com.cicero.businesseservice.app.adapters.in.rest.dtos.StockMovementDTO;
import com.cicero.businesseservice.app.domains.StockMovement;
import com.cicero.businesseservice.app.services.StockMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/stock-movement")
@RequiredArgsConstructor
public class StockMovementController {

    private final StockMovementService stockMovementService;

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StockMovementDTO> findAll() {
        return stockMovementService.findAll().stream().map(this::convert).collect(Collectors.toList());
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockMovementDTO> create(@RequestBody StockMovementDTO stockMovementDTO) {
        return ResponseEntity.ok(convert(stockMovementService.create(stockMovementDTO)));
    }

    public StockMovementDTO convert(StockMovement stockMovement) {
        StockMovementDTO dto = new StockMovementDTO();

        dto.setMovementId(stockMovement.getMovementId());
        dto.setMaterial(stockMovement.getMaterial());
        dto.setMovementType(stockMovement.getMovementType().getValue());
        dto.setLocation(stockMovement.getLocation());
        dto.setMovementDate(stockMovement.getMovementDate());
        return dto;
    }
}
