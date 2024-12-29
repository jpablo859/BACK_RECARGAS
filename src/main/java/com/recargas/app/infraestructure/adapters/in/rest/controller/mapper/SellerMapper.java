package com.recargas.app.infraestructure.adapters.in.rest.controller.mapper;

import com.recargas.app.domain.SellerDomain;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.SellerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SellerMapper {
    SellerResponse toResponse(SellerDomain sellerDomain);
}
