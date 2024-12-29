package com.recargas.app.infraestructure.adapters.out.database.repositories;

import com.recargas.app.infraestructure.adapters.out.database.entities.SaleEntity;
import com.recargas.app.infraestructure.adapters.out.database.projections.SalesSummaryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<SaleEntity, Long>, JpaSpecificationExecutor<SaleEntity> {
    @Query("SELECT o.name AS operator, s.name AS seller, COUNT(t.id) AS quantity, SUM(t.value) AS total "
            + "FROM SaleEntity t "
            + "JOIN t.operatorId o "
            + "JOIN t.sellerId s "
            + "GROUP BY o.name, s.name")
    List<SalesSummaryProjection> getSalesSummary();
}
