package com.cicero.businesseservice.app.domains;

import com.cicero.businesseservice.app.domains.enums.MovementTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Builder
@Getter
public class StockMovement {
    private UUID movementId;
    private String material;
    private MovementTypeEnum movementType; //IN, OUT, REV
    private Double amount;
    private String location;
    private LocalDateTime movementDate;
}
