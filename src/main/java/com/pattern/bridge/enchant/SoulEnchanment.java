package com.pattern.bridge.enchant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SoulEnchanment implements Enchantment{

    private Logger LOGGER = LogManager.getLogger();

    @Override
    public void onActivate() {
        LOGGER.info("The item spreads bloodlust.");
    }

    @Override
    public void apply() {
        LOGGER.info("The item eats the soul of enemies.");
    }

    @Override
    public void onDeactivate() {
        LOGGER.info("Bloodlust slowly disappears.");
    }
}
