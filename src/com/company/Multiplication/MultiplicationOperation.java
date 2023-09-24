package com.company.Multiplication;

import com.company.Operation;

public class MultiplicationOperation implements Operation {

    @Override
    public double doOperation(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
