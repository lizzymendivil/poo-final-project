package jalasoft.project.model.operation;

import jalasoft.project.model.parameter.DoubleParameter;
import jalasoft.project.model.parameter.OperationParameter;

public class DivideOperation implements IOperation {
    @Override
    public double calculate(OperationParameter operationParameter) {
        DoubleParameter doubleParameter = (DoubleParameter)operationParameter;
        return doubleParameter.getNumber1() / doubleParameter.getNumber2();
    }

    @Override
    public String getOperator() {
        return "/";
    }
}
