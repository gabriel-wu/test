package com.ericsson.csp.tsc.api.pojo;

public class Registration {

    private String  clientId;

    private String  callbackUrl;

    private boolean enableTransformation;

    private String  username;

    private String  password;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public boolean isEnableTransformation() {
        return enableTransformation;
    }

    public void setEnableTransformation(boolean enableTransformation) {
        this.enableTransformation = enableTransformation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
