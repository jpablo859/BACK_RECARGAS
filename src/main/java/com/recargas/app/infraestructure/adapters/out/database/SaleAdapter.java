package com.recargas.app.infraestructure.adapters.out.database;

import com.recargas.app.domain.SaleSummaryDomain;
import com.recargas.app.domain.SaleDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.SaleEntity;
import com.recargas.app.infraestructure.adapters.out.database.mapper.SaleEntityMapper;
import com.recargas.app.infraestructure.adapters.out.database.projections.SalesSummaryProjection;
import com.recargas.app.infraestructure.adapters.out.database.repositories.SaleRepository;
import com.recargas.app.infraestructure.adapters.out.database.specifications.SaleSpecification;
import com.recargas.app.infraestructure.ports.out.SalePort;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class SaleAdapter implements SalePort {
    private final SaleRepository saleRepository;
    private final SaleEntityMapper saleEntityMapper;

    @Override
    public SaleDomain saveSale(SaleDomain saleDomain) {
        SaleEntity saleEntity = saleEntityMapper.toEntity(saleDomain);
        saleRepository.save(saleEntity);
        return saleEntityMapper.toDomain(saleEntity);
    }

    @Override
    public List<SaleDomain> getByFilter(SaleDomain saleDomain) {
        Specification<SaleEntity> specification = SaleSpecification.applyFilters(saleDomain);
        Pageable pageable = Pageable.unpaged();
        Page<SaleEntity> pages = saleRepository.findAll(specification, pageable);
        return saleEntityMapper.toDomain(pages.getContent());
    }

    @Override
    public List<SaleSummaryDomain> getRechargeSummary() {
        List<SalesSummaryProjection> salesSummaryProjections = saleRepository.getSalesSummary();
        return saleEntityMapper.summaryToDomain(salesSummaryProjections);
    }
}
