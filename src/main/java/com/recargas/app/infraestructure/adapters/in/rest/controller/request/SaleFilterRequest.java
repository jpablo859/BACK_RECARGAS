package com.recargas.app.infraestructure.adapters.in.rest.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleFilterRequest {
    private Long sellerId;
    private Long operatorId;
}
