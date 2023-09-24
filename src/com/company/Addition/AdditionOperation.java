package com.company.Addition;

import com.company.Operation;

public class AdditionOperation implements Operation {

    @Override
    public double doOperation(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
