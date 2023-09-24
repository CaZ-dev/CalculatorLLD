package com.company;

import com.company.Factory.CalculatorOperation;
import com.company.Factory.CalculatorType;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select the type of calculator you want to use: ");
        System.out.println("Type \"basic\" for -> \"Basic Calculator\"");
        System.out.println("Type \"scientific\" for -> \"Scientific Calculator\"");
        String type = scan.nextLine();
        Calculator calculator = CalculatorType.calculatorType(type);

        while(1>0){
            System.out.println("Please input the Query below: ");
            String query = scan.nextLine();
            char[] c = query.toCharArray();
            char operator = ' ';
            List<Character> operands = Arrays.asList('+','-','/','*');
            int count = 0;
            while(operator == ' '){
                if(operands.contains(c[count])){
                    operator = c[count];
                    break;
                }
                count++;
            }
            String operand1 = query.substring(0,count);
            String operand2 = query.substring(count+1,query.length());
            Operation operation = CalculatorOperation.operation(operator,calculator);
            System.out.println("The answer is -> "+ operation.doOperation(Double.valueOf(operand1),Double.valueOf(operand2)));
        }
    }
}
