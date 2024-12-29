package com.recargas.app.infraestructure.adapters.out.database.projections;

import java.math.BigInteger;

public interface SalesSummaryProjection {
    String getOperator();
    String getSeller();
    Long getQuantity();
    BigInteger getTotal();
}
