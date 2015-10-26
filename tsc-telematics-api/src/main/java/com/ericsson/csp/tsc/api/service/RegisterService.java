package com.ericsson.csp.tsc.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.ericsson.csp.tsc.api.pojo.Registration;
import com.ericsson.csp.tsc.api.pojo.RespMessage;

@Path("/v1/message-subscription")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
public interface RegisterService {

    @GET
    public Registration getSubscription(@QueryParam("clientId") String clientId);

    @POST
    public RespMessage register(Registration registration);

    @PUT
    public Registration updateSubscription(Registration registration);

    @DELETE
    public RespMessage deleteSubscription(@QueryParam("clientId") String clientId);

}
