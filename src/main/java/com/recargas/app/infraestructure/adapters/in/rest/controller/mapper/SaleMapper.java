package com.recargas.app.infraestructure.adapters.in.rest.controller.mapper;

import com.recargas.app.domain.SaleDomain;
import com.recargas.app.domain.SaleSummaryDomain;
import com.recargas.app.infraestructure.adapters.in.rest.controller.request.SaleFilterRequest;
import com.recargas.app.infraestructure.adapters.in.rest.controller.request.SaleRequest;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.SaleResponse;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.SaleSummaryResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SaleMapper {
    SaleDomain toDomain(SaleRequest saleRequest);
    SaleDomain toFilterDomain(SaleFilterRequest saleFilterRequest);
    SaleResponse toResponse(SaleDomain saleDomain);
    List<SaleResponse> toResponse(List<SaleDomain> saleDomains);
    List<SaleSummaryResponse> toSummaryResponse(List<SaleSummaryDomain> saleDomains);
}
