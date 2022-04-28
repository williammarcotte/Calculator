package com.example.lab10;

public class Subtraction extends Operator{
    @Override
    public Operand evaluate(Operand op1, Operand op2){
        double result = op1.getValue() - op2.getValue();
        Operand op3 = new Operand(result);
        return op3;
    }
}
