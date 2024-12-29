package com.recargas.app.infraestructure.adapters.in.rest.controller;

import com.recargas.app.domain.SaleDomain;
import com.recargas.app.infraestructure.adapters.in.rest.controller.mapper.SaleMapper;
import com.recargas.app.infraestructure.adapters.in.rest.controller.request.SaleFilterRequest;
import com.recargas.app.infraestructure.adapters.in.rest.controller.request.SaleRequest;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.SaleResponse;
import com.recargas.app.infraestructure.adapters.in.rest.controller.response.SaleSummaryResponse;
import com.recargas.app.infraestructure.ports.in.GetSalesByFilterUseCase;
import com.recargas.app.infraestructure.ports.in.GetSalesSummaryUseCase;
import com.recargas.app.infraestructure.ports.in.SaveSaleUseCase;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("sale")
public class SaleController {
    private final SaveSaleUseCase saveSaleUseCase;
    private final SaleMapper saleMapper;
    private final GetSalesByFilterUseCase getSalesByFilterUseCase;
    private final GetSalesSummaryUseCase getSalesSummaryUseCase;

    @PostMapping("/save")
    public ResponseEntity<SaleResponse> saveSale(
            @Valid @RequestBody SaleRequest saleRequest
    ) {
        SaleDomain saleDomain = saleMapper.toDomain(saleRequest);
        return ResponseEntity.ok(saleMapper.toResponse(saveSaleUseCase.execute(saleDomain)));
    }

    @GetMapping("/filter")
    public ResponseEntity<List<SaleResponse>> getSalesByFilter(
            @Valid SaleFilterRequest saleFilterRequest
    ) throws BadRequestException {
        SaleDomain saleDomain = saleMapper.toFilterDomain(saleFilterRequest);
        return ResponseEntity.ok(saleMapper.toResponse(getSalesByFilterUseCase.execute(saleDomain)));
    }

    @GetMapping("/summary")
    public ResponseEntity<List<SaleSummaryResponse>> getSalesSummary() {
        return ResponseEntity.ok(saleMapper.toSummaryResponse(getSalesSummaryUseCase.execute()));
    }
}
