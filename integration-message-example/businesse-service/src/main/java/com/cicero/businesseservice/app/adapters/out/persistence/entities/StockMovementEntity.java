package com.cicero.businesseservice.app.adapters.out.persistence.entities;

import com.cicero.businesseservice.app.domains.enums.MovementTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "StockMovement")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StockMovementEntity {

    @Id
    @Column
    private UUID movmentId;

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MovementTypeEnum movementType; //IN, OUT, REV

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private LocalDateTime movementDate;
}
