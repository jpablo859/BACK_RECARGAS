package com.recargas.app.infraestructure.adapters.in.rest.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleResponse {
    private Long id;
    private Long sellerId;
    private Long operatorId;
    private String number;
    private int value;
}
