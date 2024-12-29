package com.recargas.app.infraestructure.adapters.out.database.mapper;

import com.recargas.app.domain.SellerDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.SellerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SellerEntityMapper {
    SellerDomain toDomain(SellerEntity sellerEntity);
}
