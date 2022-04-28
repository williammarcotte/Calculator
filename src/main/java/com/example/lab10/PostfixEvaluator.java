package com.example.lab10;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class PostfixEvaluator {
    private ArrayDeque<Operand> op = new ArrayDeque<>();

    private ArrayList<Token> expression = new ArrayList<>();

    public void addToken(Token t){

        expression.add(t);
    }

    public double evaluate(){

        for(int i=0;i<expression.size();i++){

            if(expression.get(i).isOperand()){
                op.push((Operand) expression.get(i));
            }
            else if(expression.get(0).isOperand() && !expression.get(1).isOperand()){
                throw new ArithmeticException("Not enough operands");
            }
            else{
                Operator operator = (Operator) expression.get(i);
                Operand op1 =op.pop();
                Operand op2 =op.pop();
                op.push(operator.evaluate(op1,op2));
            }
        }

        if(expression.isEmpty()){
            throw new ArithmeticException("No operands or operators");
        }

        if(op.size()>1){
            throw new ArithmeticException("Not enough operands");
        }

        return op.getLast().getValue();
    }
}
