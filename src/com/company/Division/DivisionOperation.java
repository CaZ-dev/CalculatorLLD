package com.company.Division;

import com.company.Operation;

public class DivisionOperation implements Operation {

    @Override
    public double doOperation(double operand1, double operand2) {
        return operand1 / operand2;
    }
}
