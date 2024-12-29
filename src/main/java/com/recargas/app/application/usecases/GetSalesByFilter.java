package com.recargas.app.application.usecases;

import com.recargas.app.domain.SaleDomain;
import com.recargas.app.infraestructure.ports.in.GetSalesByFilterUseCase;
import com.recargas.app.infraestructure.ports.out.SalePort;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class GetSalesByFilter implements GetSalesByFilterUseCase {
    private final SalePort salePort;

    @Override
    public List<SaleDomain> execute(SaleDomain saleDomain) throws BadRequestException {
        if (Objects.isNull(saleDomain.getOperatorId()) && Objects.isNull(saleDomain.getSellerId()))
            throw new BadRequestException(("Debe especificar el id del vendedor o del operador"));
        return salePort.getByFilter(saleDomain);
    }
}
