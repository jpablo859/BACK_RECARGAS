package com.recargas.app.infraestructure.adapters.out.database.mapper;

import com.recargas.app.domain.OperatorDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.OperatorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OperatorEntityMapper {
    List<OperatorDomain> toDomain(List<OperatorEntity> operatorEntities);
}
