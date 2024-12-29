package com.recargas.app.infraestructure.ports.in;

import com.recargas.app.domain.SaleDomain;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface GetSalesByFilterUseCase {
    List<SaleDomain> execute(SaleDomain saleDomain) throws BadRequestException;
}
