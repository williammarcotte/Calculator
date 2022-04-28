package com.example.lab10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPostfixEvaluator {
    @Test
    public void PostfixEvaluator_CorrectExpression_EvaluateToANumber(){
        PostfixEvaluator evaluator = new PostfixEvaluator();
        evaluator.addToken(new Operand(3));
        evaluator.addToken(new Operand(2));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Operand(5));
        evaluator.addToken(new Addition());
        evaluator.addToken(new Operand(6));
        evaluator.addToken(new Operand(4));
        evaluator.addToken(new Multiplication());
        evaluator.addToken(new Addition());
        assertEquals(evaluator.evaluate(), 35);
    }
    @Test
    public void
    PostfixEvaluator_ExpressionWithOneOperandOnlyAndOneOperator_ThrowsArithmeticException()
    {
        Exception exception = assertThrows(ArithmeticException.class, ()->{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.addToken(new Operand(3));
            evaluator.addToken(new Multiplication());
            evaluator.evaluate();
        });
        String expectedMessage = "Not enough operands";
        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    public void PostfixEvaluator_ExpressionWithNoOperandAndNoOperator_ArithmeticException(){
        Exception exception = assertThrows(ArithmeticException.class, ()->{
            PostfixEvaluator evaluator = new PostfixEvaluator();
            evaluator.evaluate();
        });
        String expectedMessage = "No operands or operators";
        String actualMessage = exception.getMessage();
        System.out.println(actualMessage);
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
