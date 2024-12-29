package com.recargas.app.infraestructure.adapters.out.database.specifications;

import com.recargas.app.domain.SaleDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.SaleEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.Objects;

@NoArgsConstructor
public class SaleSpecification {
    public static Specification<SaleEntity> bySellerId(Long sellerId) {
        return (Root<SaleEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) ->
                criteriaBuilder.equal(root.get("sellerId").get("id"), sellerId);
    }

    public static Specification<SaleEntity> byOperatorId(Long operatorId) {
        return (Root<SaleEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) ->
                criteriaBuilder.equal(root.get("operatorId").get("id"), operatorId);
    }

    public static Specification<SaleEntity> applyFilters(SaleDomain saleDomain) {
        Specification<SaleEntity> specification = Specification.where(null);

        if (Objects.nonNull(saleDomain.getSellerId())) {
            specification = specification.and(bySellerId(saleDomain.getSellerId()));
        }

        if (Objects.nonNull(saleDomain.getOperatorId())) {
            specification = specification.and(byOperatorId(saleDomain.getOperatorId()));
        }

        return specification;
    }
}
