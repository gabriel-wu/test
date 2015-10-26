package com.ericsson.csp.tsc.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ericsson.csp.tsc.api.pojo.RemoteControlReq;
import com.ericsson.csp.tsc.api.pojo.RespMessage;

@Path("/vehicle/telematics")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
public interface TelematicsResource {

    @PUT
    @Path("{vin}")
    RespMessage remoteControl(@PathParam("vin") String vin, RemoteControlReq req);
}
