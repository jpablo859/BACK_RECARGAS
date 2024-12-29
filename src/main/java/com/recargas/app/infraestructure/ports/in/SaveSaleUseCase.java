package com.recargas.app.infraestructure.ports.in;

import com.recargas.app.domain.SaleDomain;

public interface SaveSaleUseCase {
    SaleDomain execute(SaleDomain saleDomain);
}
