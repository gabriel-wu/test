package com.ericsson.csp.tsc.api.pojo;

public class DownlinkMessage {

    private MqttInfo mqttInfo;

    private SmsInfo  smsInfo;

    private String   senderId;

    private String   receiverId;

    private String   protocolId;

    private String   payload;

    public MqttInfo getMqttInfo() {
        return mqttInfo;
    }

    public void setMqttInfo(MqttInfo mqttInfo) {
        this.mqttInfo = mqttInfo;
    }

    public SmsInfo getSmsInfo() {
        return smsInfo;
    }

    public void setSmsInfo(SmsInfo smsInfo) {
        this.smsInfo = smsInfo;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

}
