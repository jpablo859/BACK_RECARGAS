package com.recargas.app.infraestructure.adapters.out.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "OPERADOR")
@Getter
@Setter
@NoArgsConstructor
public class OperatorEntity extends CommonEntity {
    @OneToMany(mappedBy = "operatorId", fetch = FetchType.LAZY)
    private List<SaleEntity> sales;
}
