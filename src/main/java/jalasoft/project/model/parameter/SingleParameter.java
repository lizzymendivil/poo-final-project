package jalasoft.project.model.parameter;

public class SingleParameter extends OperationParameter {
    private double number;

    public SingleParameter(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
