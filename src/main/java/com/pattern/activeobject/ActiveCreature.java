package com.pattern.activeobject;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ActiveCreature {

    private static final Logger logger = LogManager.getLogger();

    private BlockingQueue<Runnable> requests;

    private String name;

    private Thread thread;

    public ActiveCreature(String name) {
        this.name = name;
        this.requests = new LinkedBlockingQueue<Runnable>();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try{
                       requests.take().run();
                    } catch (Exception e){
                        logger.error(e.getMessage());
                    }
                }
            }
        });
        thread.start();
    }


    public void eat() throws InterruptedException {
        requests.put(() -> {
            logger.info("{} is eating!",name());
            logger.info("{} has finished eating!",name());
        });
    }

    public void roam() throws InterruptedException {
        requests.put(new Runnable() {
                         @Override
                         public void run() {
                             logger.info("{} has started to roam the wastelands.",name());
                         }
                     }
        );
    }

    public String name() {
        return this.name;
    }
}
