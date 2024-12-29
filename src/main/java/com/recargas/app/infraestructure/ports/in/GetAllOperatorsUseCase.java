package com.recargas.app.infraestructure.ports.in;

import com.recargas.app.domain.OperatorDomain;

import java.util.List;

public interface GetAllOperatorsUseCase {
    List<OperatorDomain> execute();
}
