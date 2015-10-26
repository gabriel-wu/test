package com.ericsson.csp.tsc.api.pojo;

public class Response {

    private int    statusCode;

    private String message;

    public Response(int statusCode) {
        this.statusCode = statusCode;
    }

    public Response(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
