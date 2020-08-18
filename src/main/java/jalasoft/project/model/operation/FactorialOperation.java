package jalasoft.project.model.operation;

import jalasoft.project.model.parameter.OperationParameter;
import jalasoft.project.model.parameter.SingleParameter;

public class FactorialOperation implements IOperation {
    @Override
    public double calculate(OperationParameter operationParameter) {
        SingleParameter singleParameter = (SingleParameter)operationParameter;
        return factorial(singleParameter.getNumber());
    }

    @Override
    public String getOperator() {
        return "!";
    }

    static private double factorial(double number) {
        if (number == 0) return 1;
        else return number * factorial(number-1);
    }
}
