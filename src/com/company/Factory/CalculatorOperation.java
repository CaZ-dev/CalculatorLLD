package com.company.Factory;

import com.company.Addition.AdditionOperation;
import com.company.Calculator;
import com.company.Division.DivisionOperation;
import com.company.Multiplication.MultiplicationOperation;
import com.company.Operation;
import com.company.Subtraction.SubtractionOperation;

public class CalculatorOperation {
    public static Operation operation(char operator, Calculator calculator){
        switch (operator){
            case('-'):
                return calculator.Subtraction();
            case('*'):
                return calculator.Multiplication();
            case('/'):
                return calculator.Division();
            default:
                return calculator.Addition();
        }
    }
}
