package com.recargas.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDomain {
    private Long id;
    private Long sellerId;
    private Long operatorId;
    private String number;
    private int value;
}
