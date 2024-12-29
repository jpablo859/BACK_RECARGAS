package com.recargas.app.infraestructure.adapters.out.database.repositories;

import com.recargas.app.infraestructure.adapters.out.database.entities.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<SellerEntity, Long> {
}
