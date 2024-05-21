package com.example.purefunctiontestingapi.services;

import com.example.purefunctiontestingapi.exceptions.CalculationException;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public int multiplyPositiveNumbers(int a, int b) throws CalculationException {
        if (a < 0 || b < 0){
            throw new CalculationException("Can not multiply with a negative number");
        }

        return a * b;
    }
}
