package com.recargas.app.infraestructure.ports.in;

import com.recargas.app.domain.SaleSummaryDomain;

import java.util.List;

public interface GetSalesSummaryUseCase {
    List<SaleSummaryDomain> execute();
}
