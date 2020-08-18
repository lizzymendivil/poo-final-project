package jalasoft.project.model.operation;

import jalasoft.project.model.parameter.DoubleParameter;
import jalasoft.project.model.parameter.SingleParameter;

public class Calculator  {
    private static double result = 0;

    static private void printResult() {
        System.out.println(result);
    }
    static private void printResult(double operand1, double operand2, String operator) {
        System.out.println(operand1 + operator + operand2 + "=" + result);
    }

    static public double add(double number1, double number2) {
        IOperation operation = new AddOperation();
        result = operation.calculate(new DoubleParameter(number1, number2));
        printResult(number1, number2, operation.getOperator());
        return result;
    }

    static public double subtract(Double number1, Double number2) throws Exception {
        if (number1 != null && number2 != null) {
            IOperation operation = new SubtractOperation();
            result = operation.calculate(new DoubleParameter(number1, number2));
            printResult(number1, number2, operation.getOperator());
        }
        return result;
    }

    static public double factorial(double number) {
        if (number >= 0 ) {
            IOperation operation = new FactorialOperation();
            result = operation.calculate(new SingleParameter(number));
            printResult();
        }
        return  result;
    }

    static public double divide(double number1, double number2) throws Exception {
        if (number2 == 0) {
            throw new Exception("Divide by zero gives infinity as result");
        }
        IOperation operation = new DivideOperation();
        result = operation.calculate(new DoubleParameter(number1, number2));
        printResult(number1, number2, operation.getOperator());
        return  result;
    }
}
