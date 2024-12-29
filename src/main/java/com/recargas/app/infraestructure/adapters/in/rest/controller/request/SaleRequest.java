package com.recargas.app.infraestructure.adapters.in.rest.controller.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleRequest {
    @NotNull(message = "El vendedor es obligatorio")
    private Long sellerId;

    @NotNull(message = "El operador es obligatorio")
    private Long operatorId;

    @NotNull(message = "El número de la venta es obligatorio")
    @Size(max = 10, message = "El número de la venta no debe exceder los 10 caracteres")
    private String number;

    @NotNull(message = "El valor de la venta es obligatorio")
    @Min(value = 0, message = "El valor de la venta no debe ser negativo")
    private int value;
}
