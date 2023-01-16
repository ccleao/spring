package com.cicero.integrationservice.app.out.clients;

import com.cicero.integrationservice.app.out.clients.dtos.StockMovementDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.apachecommons.CommonsLog;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;

@Service
@CommonsLog
public class StockMovementClient {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();;

    private final ObjectMapper mapper;

    public StockMovementClient() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.configure(SerializationFeature.WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS, false);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
    }

    public String post(StockMovementDTO stockMovementDTO) throws IOException {

        log.info("Sending Post: " + stockMovementDTO);
        String json = mapper.writeValueAsString(stockMovementDTO);

        HttpPost httpPost = new HttpPost("http://localhost:8080/api/stock-movement");
        httpPost.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));

        return httpClient.execute(httpPost, HttpClientStringResponseHandler.instance);
    }
}
