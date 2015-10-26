package com.ericsson.csp.tsc.api.pojo;

public class MqttInfo {

    private long ttl;

    private QoS  QoS;

    public long getTtl() {
        return ttl;
    }

    public void setTtl(long ttl) {
        this.ttl = ttl;
    }

    public QoS getQoS() {
        return QoS;
    }

    public void setQoS(QoS qoS) {
        QoS = qoS;
    }

    

}
