package com.recargas.app.infraestructure.adapters.out.database.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public class CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE", nullable = false, length = 50)
    private String name;
}
