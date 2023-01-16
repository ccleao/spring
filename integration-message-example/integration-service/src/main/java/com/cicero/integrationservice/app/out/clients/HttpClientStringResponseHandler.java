package com.cicero.integrationservice.app.out.clients;

import lombok.extern.apachecommons.CommonsLog;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;

import java.io.IOException;

@CommonsLog
public class HttpClientStringResponseHandler implements HttpClientResponseHandler<String> {

    public static HttpClientStringResponseHandler instance = new HttpClientStringResponseHandler();

    @Override
    public String handleResponse(ClassicHttpResponse response) throws HttpException, IOException {
        if(response.getCode() == 200) {
            log.info("SUCCESS");
        } else {
            log.error("ERROR: " + response.getCode());
            throw new RuntimeException("Error requesting Stock Movement update");
        }
        return response.getEntity().toString();
    }
}
