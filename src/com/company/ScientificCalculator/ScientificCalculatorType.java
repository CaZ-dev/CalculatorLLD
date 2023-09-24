package com.company.ScientificCalculator;

import com.company.Addition.AdditionOperation;
import com.company.Calculator;
import com.company.Division.DivisionOperation;
import com.company.Multiplication.MultiplicationOperation;
import com.company.Operation;
import com.company.Subtraction.SubtractionOperation;

public class ScientificCalculatorType implements Calculator {

    @Override
    public Operation Addition() {
        return new AdditionOperation();
    }

    @Override
    public Operation Subtraction() {
        return new SubtractionOperation();
    }

    @Override
    public Operation Multiplication() {
        return new MultiplicationOperation();
    }

    @Override
    public Operation Division() {
        return new DivisionOperation();
    }
}
