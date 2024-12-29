package com.recargas.app.infraestructure.adapters.out.database.mapper;

import com.recargas.app.domain.SaleSummaryDomain;
import com.recargas.app.domain.SaleDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.OperatorEntity;
import com.recargas.app.infraestructure.adapters.out.database.entities.SaleEntity;
import com.recargas.app.infraestructure.adapters.out.database.entities.SellerEntity;
import com.recargas.app.infraestructure.adapters.out.database.projections.SalesSummaryProjection;
import com.recargas.app.infraestructure.adapters.out.database.repositories.OperatorRepository;
import com.recargas.app.infraestructure.adapters.out.database.repositories.SellerRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class SaleEntityMapper {

    @Autowired
    private OperatorRepository operatorRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Mappings({
            @Mapping(target = "operatorId", expression = "java(mapOperator(saleEntity.getOperatorId()))"),
            @Mapping(target = "sellerId", expression = "java(mapSeller(saleEntity.getSellerId()))")
    })
    public abstract SaleDomain toDomain(SaleEntity saleEntity);

    @Mappings({
            @Mapping(target = "operatorId", expression = "java(mapOperator(saleEntity.getOperatorId()))"),
            @Mapping(target = "sellerId", expression = "java(mapSeller(saleEntity.getSellerId()))")
    })
    public abstract List<SaleDomain> toDomain(List<SaleEntity> saleEntities);

    public abstract List<SaleSummaryDomain> summaryToDomain(List<SalesSummaryProjection> rechargeSummaryProjections);

    public abstract SaleEntity toEntity(SaleDomain saleDomain);

    protected OperatorEntity mapOperator(Long operatorId) {
        return operatorRepository.findById(operatorId).orElse(null);
    }

    protected SellerEntity mapSeller(Long sellerId) {
        return sellerRepository.findById(sellerId).orElse(null);
    }

    protected Long mapOperator(OperatorEntity operatorEntity) {
        return operatorEntity != null ? operatorEntity.getId() : null;
    }

    protected Long mapSeller(SellerEntity sellerEntity) {
        return sellerEntity != null ? sellerEntity.getId() : null;
    }
}
