package com.example.purefunctiontestingapi.controllers;

import com.example.purefunctiontestingapi.DTO.CalculationDTO;
import com.example.purefunctiontestingapi.exceptions.CalculationException;
import com.example.purefunctiontestingapi.services.CalculationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pure-function")
public class PureFunctionController {

    private CalculationService calculationService;

    public PureFunctionController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping
    public int multiplyPositiveNumbers(@RequestBody CalculationDTO calculationDTO) throws CalculationException {
        int outcome = this.calculationService.multiplyPositiveNumbers(calculationDTO.a, calculationDTO.b);

        return outcome;
    }
}
