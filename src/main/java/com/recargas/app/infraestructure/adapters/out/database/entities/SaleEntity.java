package com.recargas.app.infraestructure.adapters.out.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VENTA")
@Getter
@Setter
@NoArgsConstructor
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERADOR_ID", foreignKey = @ForeignKey(name = "FK_VENTA_OPERADOR"), nullable = false)
    private OperatorEntity operatorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VENDEDOR_ID", foreignKey = @ForeignKey(name = "FK_VENTA_VENDEDOR"), nullable = false)
    private SellerEntity sellerId;

    @Column(name = "NUMERO")
    private String number;

    @Column(name = "VALOR")
    private int value;
}
