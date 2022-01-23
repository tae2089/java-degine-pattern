package com.pattern.ambassador.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.Thread.sleep;

public class RemoteService  implements RemoteServiceInterface{

    private static RemoteService remoteService;

    private final Logger Logger = LogManager.getLogger();

    static synchronized RemoteService getRemoteService(){
        if (remoteService == null) {
            remoteService = new RemoteService();
        }
        return remoteService;
    }

    private RemoteService() {}

    @Override
    public long doRemoteFunction(int value) {
        long waitTime = (long) Math.floor(Math.random() * 1000);
        try {
            sleep(waitTime);
        } catch (InterruptedException e) {
            Logger.error("Thread sleep interrupted", e);
        }
        return waitTime >= 200 ? value * 10 : -1;
    }
}
