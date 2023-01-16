package com.cicero.businesseservice.app.domains.enums;

import lombok.Getter;

public enum MovementTypeEnum {

    IN("In"),
    OUT("Out"),
    REV("Reverse");

    @Getter
    private String value;

    MovementTypeEnum(String value){
        this.value = value;
    }

    public static MovementTypeEnum valueOfEnum(String value) {
        if (value == null) {
            return null;
        }
        for (MovementTypeEnum e : values()) {
            if (e.getValue().equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new RuntimeException("Invalid value of enum for MovementTypeEnum");
    }
}
