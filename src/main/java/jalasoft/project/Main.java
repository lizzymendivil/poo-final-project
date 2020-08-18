package jalasoft.project;

import jalasoft.project.model.operation.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws Exception {
        Calculator.add(5, 20);
        Calculator.subtract(60.0, 5.0);
        Calculator.factorial(-8);
        try {
            Calculator.divide(20, 0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        SpringApplication.run(Main.class, args);
    }
}
