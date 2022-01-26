package com.pattern.businessdelegate;

import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Setter
public class NetflixService implements VideoStreamingService {
    private final Logger logger = LogManager.getLogger();



    @Override
    public void doProcessing() {
        logger.info("netfliex start");
    }
}
