package com.recargas.app.application.usecases;

import com.recargas.app.domain.SellerDomain;
import com.recargas.app.infraestructure.ports.in.GetSellerByIdUseCase;
import com.recargas.app.infraestructure.ports.out.SellerPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetSellerById implements GetSellerByIdUseCase {
    private final SellerPort sellerPort;

    @Override
    public SellerDomain execute(Long id) {
        return sellerPort.getSellerById(id);
    }
}
