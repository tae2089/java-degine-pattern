package com.pattern.ambassador;

import com.pattern.ambassador.service.ServiceAmbassador;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client {

    private final ServiceAmbassador serviceAmbassador = new ServiceAmbassador();
    private final Logger LOGGER = LogManager.getLogger();
    
    long useService(int value) {
        var result = serviceAmbassador.doRemoteFunction(value);
        LOGGER.info("Service result: {}", result);
        return result;
    }
}
