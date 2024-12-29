package com.recargas.app.application.usecases;

import com.recargas.app.domain.OperatorDomain;
import com.recargas.app.infraestructure.ports.in.GetAllOperatorsUseCase;
import com.recargas.app.infraestructure.ports.out.OperatorPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetAllOperators implements GetAllOperatorsUseCase {
    private final OperatorPort operatorPort;
    @Override
    public List<OperatorDomain> execute() {
        return operatorPort.getAllOperators();
    }
}
