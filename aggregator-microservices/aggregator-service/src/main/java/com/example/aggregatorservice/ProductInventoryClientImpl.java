package com.example.aggregatorservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class ProductInventoryClientImpl implements ProductInventoryClient{

    private Logger LOGGER = LogManager.getLogger();

    @Override
    public Integer getProductInventories() {
        var response = "";
        var request = HttpRequest.
                newBuilder().
                GET().
                uri(URI.create("http://localhost:5005/inventories"))
                .build();
        var client = HttpClient.newHttpClient();
        try {
            var httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            response = httpResponse.body();
        } catch (IOException ioe) {
            LOGGER.error("IOException Occurred", ioe);
        } catch (InterruptedException ie) {
            LOGGER.error("InterruptedException Occurred", ie);
            Thread.currentThread().interrupt();
        }
        if ("".equalsIgnoreCase(response)) {
            return null;
        } else {
            return Integer.parseInt(response);
        }
    }
}
