package com.pattern.businessdelegate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class YoutubeService implements VideoStreamingService {
    private final Logger logger = LogManager.getLogger();


    @Override
    public void doProcessing() {
        logger.info("youtube start");
    }
}
