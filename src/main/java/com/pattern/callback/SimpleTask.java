package com.pattern.callback;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleTask implements Task{
    private final Logger logger = LogManager.getLogger();

    @Override
    public void execute() {
        logger.info("Perform some important activity and after call the callback method.");
    }
}
