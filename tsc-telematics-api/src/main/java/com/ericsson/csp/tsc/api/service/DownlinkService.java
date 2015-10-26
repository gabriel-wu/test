package com.ericsson.csp.tsc.api.service;

import com.ericsson.csp.tsc.api.pojo.DownlinkMessage;
import com.ericsson.csp.tsc.api.pojo.RespMessage;

public interface DownlinkService {

    public RespMessage downlink(DownlinkMessage downlinkMessage);
}
