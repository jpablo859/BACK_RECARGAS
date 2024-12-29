package com.recargas.app.infraestructure.adapters.in.rest.controller;

import com.recargas.app.infraestructure.adapters.in.rest.controller.mapper.OperatorMapper;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.OperatorResponse;
import com.recargas.app.infraestructure.ports.in.GetAllOperatorsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("operator")
public class OperatorController {
    private final OperatorMapper operatorMapper;
    private final GetAllOperatorsUseCase getAllOperatorsUseCase;

    @GetMapping("/all")
    public List<OperatorResponse> getAllOperators() {
        return operatorMapper.toResponse(getAllOperatorsUseCase.execute());
    }
}
