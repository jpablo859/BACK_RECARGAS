package com.recargas.app.application.usecases;

import com.recargas.app.domain.SaleDomain;
import com.recargas.app.infraestructure.ports.in.SaveSaleUseCase;
import com.recargas.app.infraestructure.ports.out.SalePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class SaveSale implements SaveSaleUseCase {
    private final SalePort salePort;

    @Override
    @Transactional
    public SaleDomain execute(SaleDomain saleDomain) {
        return salePort.saveSale(saleDomain);
    }
}
