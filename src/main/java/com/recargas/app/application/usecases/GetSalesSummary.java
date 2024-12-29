package com.recargas.app.application.usecases;

import com.recargas.app.domain.SaleSummaryDomain;
import com.recargas.app.infraestructure.ports.in.GetSalesSummaryUseCase;
import com.recargas.app.infraestructure.ports.out.SalePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetSalesSummary implements GetSalesSummaryUseCase {
    private final SalePort salePort;

    @Override
    public List<SaleSummaryDomain> execute() {
        return salePort.getRechargeSummary();
    }
}
