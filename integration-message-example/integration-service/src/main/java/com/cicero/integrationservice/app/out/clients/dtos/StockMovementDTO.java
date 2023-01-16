package com.cicero.integrationservice.app.out.clients.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StockMovementDTO {

    private UUID movementId;
    private String material;
    private String movementType; //IN, OUT, REV
    private Double amount;
    private String location;
    private LocalDateTime movementDate;
}
