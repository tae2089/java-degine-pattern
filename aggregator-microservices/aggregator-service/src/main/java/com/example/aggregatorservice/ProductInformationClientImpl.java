package com.example.aggregatorservice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ProductInformationClientImpl implements ProductInformationClient{

    private Logger LOGGER = LogManager.getLogger();
    @Override
    public String getProductTitle() {
        var request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://localhost:5006/information"))
                .build();
        var client = HttpClient.newHttpClient();
        try {
            var httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            return httpResponse.body();
        } catch (IOException ioe) {
            LOGGER.error("IOException Occurred", ioe);
        } catch (InterruptedException ie) {
            LOGGER.error("InterruptedException Occurred", ie);
            Thread.currentThread().interrupt();
        }
        return null;
    }
}
