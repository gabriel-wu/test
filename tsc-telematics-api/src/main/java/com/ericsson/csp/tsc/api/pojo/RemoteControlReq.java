package com.ericsson.csp.tsc.api.pojo;

import java.util.Date;

public class RemoteControlReq {

    private String              userId;

    private String              serviceId;

    private Date                timestamp;

    private String              creator;

    private OperationScheduling operationScheduling;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public OperationScheduling getOperationScheduling() {
        return operationScheduling;
    }

    public void setOperationScheduling(OperationScheduling operationScheduling) {
        this.operationScheduling = operationScheduling;
    }

}
