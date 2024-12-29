package com.recargas.app.infraestructure.ports.out;

import com.recargas.app.domain.SellerDomain;

public interface SellerPort {
    SellerDomain getSellerById(Long id);
}
