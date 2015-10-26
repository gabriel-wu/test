package com.ericsson.csp.tsc.api.service.example;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ericsson.csp.tsc.api.pojo.OperationScheduling;
import com.ericsson.csp.tsc.api.pojo.RemoteControlReq;

public class JacksonExample {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        objectToJson(mapper);

        jsonToObject(mapper);
    }

    private static void jsonToObject(ObjectMapper mapper) {
        StringBuilder json = new StringBuilder(1024);
        json.append("{\"userId\":\"dengjianming\",\"serviceId\":\"rcc\",\"timestamp\":1445270127051")
                .append(",\"creator\":\"tc\",\"operationScheduling\":{\"scheduledTime\":1443781200,\"recurrentOperation\":true")
                .append(",\"duration\":1555200,\"interval\":8640,\"occurs\":-1}}");

        try {
            RemoteControlReq req = mapper.readValue(json.toString(), RemoteControlReq.class);
            System.out.println(req.getUserId());
            System.out.println(req.getServiceId());
            System.out.println(req.getTimestamp());
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void objectToJson(ObjectMapper mapper) {
        OperationScheduling operationScheduling = new OperationScheduling();
        operationScheduling.setScheduledTime(new Date(1443781200L));
        operationScheduling.setRecurrentOperation(true);
        operationScheduling.setDuration(1555200);
        operationScheduling.setInterval(8640);
        operationScheduling.setOccurs(-1);

        RemoteControlReq req = new RemoteControlReq();
        req.setUserId("dengjianming");
        req.setServiceId("rcc");
        req.setTimestamp(new Date());
        req.setCreator("tc");
        req.setOperationScheduling(operationScheduling);

        try {
            // mapper.writeValue(new File("c:\\req.json"), req);
            System.out.println(mapper.writeValueAsString(req));
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
