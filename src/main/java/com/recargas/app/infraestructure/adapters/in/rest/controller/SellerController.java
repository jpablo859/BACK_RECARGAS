package com.recargas.app.infraestructure.adapters.in.rest.controller;

import com.recargas.app.infraestructure.adapters.in.rest.controller.mapper.SellerMapper;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.SellerResponse;
import com.recargas.app.infraestructure.ports.in.GetSellerByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("seller")
public class SellerController {
    private final SellerMapper sellerMapper;
    private final GetSellerByIdUseCase getSellerByIdUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<SellerResponse> getSellerById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(sellerMapper.toResponse(getSellerByIdUseCase.execute(id)));
    }
}
