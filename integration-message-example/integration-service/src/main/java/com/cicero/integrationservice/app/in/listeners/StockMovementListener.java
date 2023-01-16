package com.cicero.integrationservice.app.in.listeners;

import com.cicero.integrationservice.app.out.clients.StockMovementClient;
import com.cicero.integrationservice.app.out.clients.dtos.StockMovementDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@CommonsLog
@RestController
@RequestMapping("/api/listener")
public class StockMovementListener {

    private final StockMovementClient stockMovementClient;
    public void createMovement() {
        StockMovementDTO stockMovementDTO = new StockMovementDTO();

        stockMovementDTO.setMovementId(UUID.randomUUID());
        stockMovementDTO.setMaterial("CAFE");
        stockMovementDTO.setMovementType("IN");
        stockMovementDTO.setAmount(25d);
        stockMovementDTO.setLocation("MUTUCA2");
        stockMovementDTO.setMovementDate(LocalDateTime.now());

        try {
            String response = stockMovementClient.post(stockMovementDTO);
            log.info("Response: " + response);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping(path = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public void create() {
        log.info("Creating Movement");
        createMovement();
    }
}
