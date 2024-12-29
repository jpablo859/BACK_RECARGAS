package com.recargas.app.infraestructure.ports.out;

import com.recargas.app.domain.OperatorDomain;

import java.util.List;

public interface OperatorPort {
    List<OperatorDomain> getAllOperators();
}
