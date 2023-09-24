package com.company.Subtraction;

import com.company.Operation;

public class SubtractionOperation implements Operation {

    @Override
    public double doOperation(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
