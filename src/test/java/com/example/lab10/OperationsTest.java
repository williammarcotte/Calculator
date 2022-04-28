package com.example.lab10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OperationsTest {
    @Test
    public void AdditionEvaluate_TwoPositiveOperands_AddTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),5);
    }
    @Test
    public void AdditionEvaluate_TwoNegativeOperands_AddTheNumbers(){
        Operand op1 = new Operand(-3);
        Operand op2 = new Operand(-4);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-7);
    }
    @Test
    public void AdditionEvaluate_OneNegativeOperand_OnePositiveOperand_AddTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(-3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-1);
    }

    @Test
    public void SubtractionEvaluate_TwoPositiveOperands_SubtractTheNumbers(){
        Operand op1 = new Operand(6);
        Operand op2 = new Operand(23);
        Subtraction addition = new Subtraction();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-17);
    }
    @Test
    public void SubtractionEvaluate_TwoNegativeOperands_SubtractTheNumbers(){
        Operand op1 = new Operand(-6);
        Operand op2 = new Operand(-23);
        Subtraction addition = new Subtraction();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),17);
    }
    @Test
    public void SubtractionEvaluate_OneNegativeOperand_OnePositiveOperand_SubtractTheNumbers(){
        Operand op1 = new Operand(6);
        Operand op2 = new Operand(-23);
        Subtraction addition = new Subtraction();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),29);
    }
    @Test
    public void DivisionEvaluate_TwoPositiveOperands_DivideTheNumbers(){
        Operand op1 = new Operand(96);
        Operand op2 = new Operand(8);
        Division addition = new Division();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),12);
    }
    @Test
    public void DivisionEvaluate_TwoNegativeOperands_DivideTheNumbers(){
        Operand op1 = new Operand(-96);
        Operand op2 = new Operand(-8);
        Division addition = new Division();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),12);
    }
    @Test
    public void DivisionEvaluate_OneNegativeOperand_OnePositiveOperand_DivideTheNumbers(){
        Operand op1 = new Operand(96);
        Operand op2 = new Operand(-8);
        Division addition = new Division();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-12);
    }
    @Test
    public void MultiplicationEvaluate_TwoPositiveOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(7);
        Operand op2 = new Operand(5);
        Multiplication addition = new Multiplication();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),35);
    }
    @Test
    public void MultiplicationEvaluate_TwoNegativeOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(-7);
        Operand op2 = new Operand(-5);
        Multiplication addition = new Multiplication();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),35);
    }
    @Test
    public void MultiplicationEvaluate_OneNegativeOperand_OnePositiveOperand_MultiplyTheNumbers(){
        Operand op1 = new Operand(7);
        Operand op2 = new Operand(-5);
        Multiplication addition = new Multiplication();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),-35);
    }
}
