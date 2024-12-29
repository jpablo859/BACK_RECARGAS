package com.recargas.app.infraestructure.adapters.in.rest.controller.mapper;

import com.recargas.app.domain.OperatorDomain;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.OperatorResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OperatorMapper {
    List<OperatorResponse> toResponse(List<OperatorDomain> operatorDomainList);
}
