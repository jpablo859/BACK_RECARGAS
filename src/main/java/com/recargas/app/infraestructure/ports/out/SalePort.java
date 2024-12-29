package com.recargas.app.infraestructure.ports.out;

import com.recargas.app.domain.SaleSummaryDomain;
import com.recargas.app.domain.SaleDomain;

import java.util.List;

public interface SalePort {
    SaleDomain saveSale(SaleDomain saleDomain);
    List<SaleDomain> getByFilter(SaleDomain saleDomain);
    List<SaleSummaryDomain> getRechargeSummary();
}
