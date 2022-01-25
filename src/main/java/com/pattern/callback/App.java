package com.pattern.callback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

        var task = new SimpleTask();
        task.executWith(() -> logger.info("hello"));
    }
}
