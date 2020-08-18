package jalasoft.project.controller.response;

public class OKResponse<T> extends Response {
    private String message;

    public OKResponse(T status, String message) {
        super(status);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}