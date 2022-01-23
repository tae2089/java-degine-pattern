package com.pattern.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FishingBoat {

    private final Logger logger = LogManager.getLogger();

    public void sail(){
        logger.info("The fishing boat is sailing");
    }
}
