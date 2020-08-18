package jalasoft.project.model.operation;

import jalasoft.project.model.parameter.OperationParameter;

public interface IOperation {
    double calculate(OperationParameter operationParameter);
    String getOperator();
}
