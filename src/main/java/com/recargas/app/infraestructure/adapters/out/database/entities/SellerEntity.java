package com.recargas.app.infraestructure.adapters.out.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "VENDEDOR")
@Getter
@Setter
@NoArgsConstructor
public class SellerEntity extends CommonEntity {
    @OneToMany(mappedBy = "sellerId", fetch = FetchType.LAZY)
    private List<SaleEntity> sales;
}
