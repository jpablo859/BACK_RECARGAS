package com.recargas.app.infraestructure.adapters.out.database;

import com.recargas.app.domain.SellerDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.SellerEntity;
import com.recargas.app.infraestructure.adapters.out.database.mapper.SellerEntityMapper;
import com.recargas.app.infraestructure.adapters.out.database.repositories.SellerRepository;
import com.recargas.app.infraestructure.ports.out.SellerPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class SellerAdapter implements SellerPort {
    private final SellerRepository sellerRepository;
    private final SellerEntityMapper sellerEntityMapper;

    @Override
    public SellerDomain getSellerById(Long id) {
        Optional<SellerEntity> sellerEntity = sellerRepository.findById(id);

        return sellerEntity.map(sellerEntityMapper::toDomain).orElse(null);
    }
}
