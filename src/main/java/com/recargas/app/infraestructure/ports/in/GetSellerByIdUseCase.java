package com.recargas.app.infraestructure.ports.in;

import com.recargas.app.domain.SellerDomain;

public interface GetSellerByIdUseCase {
    SellerDomain execute(Long id);
}
