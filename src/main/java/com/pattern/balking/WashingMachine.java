package com.pattern.balking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class WashingMachine {
    private final DelayProvider delayProvider;
    private WashingMachineState washingMachineState;
    private static Logger LOGGER = LogManager.getLogger();
    /**
     * Creates a new instance of WashingMachine.
     */
    public WashingMachine() {
        this((interval, timeUnit, task) -> {
            try {
                Thread.sleep(timeUnit.toMillis(interval));
            } catch (InterruptedException ie) {
                LOGGER.error("", ie);
                Thread.currentThread().interrupt();
            }
            task.run();
        });
    }

    /**
     * Creates a new instance of WashingMachine using provided delayProvider. This constructor is used
     * only for unit testing purposes.
     */
    public WashingMachine(DelayProvider delayProvider) {
        this.delayProvider = delayProvider;
        this.washingMachineState = WashingMachineState.ENABLED;
    }

    public WashingMachineState getWashingMachineState() {
        return washingMachineState;
    }

    /**
     * Method responsible for washing if the object is in appropriate state.
     */
    public void wash() {
        synchronized (this) {
            var machineState = getWashingMachineState();
            LOGGER.info("{}: Actual machine state: {}", Thread.currentThread().getName(), machineState);
            if (this.washingMachineState == WashingMachineState.WASHING) {
                LOGGER.error("Cannot wash if the machine has been already washing!");
                return;
            }
            this.washingMachineState = WashingMachineState.WASHING;
        }
        LOGGER.info("{}: Doing the washing", Thread.currentThread().getName());

        this.delayProvider.executeAfterDelay(50, TimeUnit.MILLISECONDS, this::endOfWashing);
    }

    /**
     * Method responsible of ending the washing by changing machine state.
     */
    public synchronized void endOfWashing() {
        washingMachineState = WashingMachineState.ENABLED;
        LOGGER.info("{}: Washing completed.", Thread.currentThread().getId());
    }
}
