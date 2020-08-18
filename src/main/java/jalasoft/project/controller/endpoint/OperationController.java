package jalasoft.project.controller.endpoint;

import jalasoft.project.controller.response.ErrorResponse;
import jalasoft.project.controller.response.OKResponse;
import jalasoft.project.controller.response.Response;
import jalasoft.project.model.operation.Calculator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1")
public class OperationController {

    private static final String RESULT = "El resultado de la operación es ";

    @PostMapping("/add")
    public ResponseEntity<Response> add(double number1, double number2) {
        try {
            double result = Calculator.add(number1, number2);
            return ResponseEntity.ok().body(
                    new OKResponse<Integer>(HttpServletResponse.SC_OK, RESULT + String.valueOf(result))
            );
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        }
    }

    @PostMapping("/subtract")
    public ResponseEntity<Response> subtract(double number1, double number2) {
        try {
            double result = Calculator.subtract(number1, number2);
            return ResponseEntity.ok().body(
                    new OKResponse<Integer>(HttpServletResponse.SC_OK, RESULT + String.valueOf(result))
            );
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        }
    }

    @PostMapping("/factorial")
    public ResponseEntity<Response> factorial(double number) {
        try {
            double result = Calculator.factorial(number);
            return ResponseEntity.ok().body(
                    new OKResponse<Integer>(HttpServletResponse.SC_OK, RESULT + String.valueOf(result))
            );
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        }
    }

    @PostMapping("/divide")
    public ResponseEntity<Response> divide(double number1, double number2) {
        try {
            double result = Calculator.divide(number1, number2);
            return ResponseEntity.ok().body(
                    new OKResponse<Integer>(HttpServletResponse.SC_OK, RESULT + String.valueOf(result))
            );
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        }
    }
}
