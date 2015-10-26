package com.ericsson.csp.tsc.api.pojo;

import java.util.Date;

public class OperationScheduling {

    private Date    scheduledTime;

    private boolean recurrentOperation;

    private int     duration;

    private int     interval;

    private int     occurs;

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public boolean isRecurrentOperation() {
        return recurrentOperation;
    }

    public void setRecurrentOperation(boolean recurrentOperation) {
        this.recurrentOperation = recurrentOperation;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getOccurs() {
        return occurs;
    }

    public void setOccurs(int occurs) {
        this.occurs = occurs;
    }

}
