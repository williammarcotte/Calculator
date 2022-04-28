package com.example.lab10;

public final class Operand implements Token{
    private double value;

    public Operand(double val){
        value = val;
    }

    @Override
    public boolean isOperand(){
        return true;
    }

    public double getValue(){
        return value;
    }
}
