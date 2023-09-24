package com.company.Factory;

import com.company.BasicCalculator.BasicCalculatorType;
import com.company.Calculator;
import com.company.ScientificCalculator.ScientificCalculatorType;

public class CalculatorType {
    public static Calculator calculatorType(String calculator){
        switch(calculator){
            case "basic":
                return new BasicCalculatorType();
            case "scientific":
                return new ScientificCalculatorType();
            default:
                return new BasicCalculatorType();
        }
    }
}
