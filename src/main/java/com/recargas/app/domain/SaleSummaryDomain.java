package com.recargas.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleSummaryDomain {
    private String operator;
    private String seller;
    private Long quantity;
    private BigInteger total;
}