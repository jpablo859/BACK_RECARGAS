package com.recargas.app.infraestructure.adapters.out.database;

import com.recargas.app.domain.OperatorDomain;
import com.recargas.app.infraestructure.adapters.out.database.entities.OperatorEntity;
import com.recargas.app.infraestructure.adapters.out.database.mapper.OperatorEntityMapper;
import com.recargas.app.infraestructure.adapters.out.database.repositories.OperatorRepository;
import com.recargas.app.infraestructure.ports.out.OperatorPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class OperatorAdapter implements OperatorPort {
    private final OperatorRepository operatorRepository;
    private final OperatorEntityMapper operatorEntityMapper;

    @Override
    public List<OperatorDomain> getAllOperators() {
        List<OperatorEntity> operatorEntities = operatorRepository.findAll();
        return operatorEntityMapper.toDomain(operatorEntities);
    }
}
