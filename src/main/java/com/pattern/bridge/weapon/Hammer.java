package com.pattern.bridge.weapon;

import com.pattern.bridge.enchant.Enchantment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hammer implements Weapon{
    private  Enchantment enchantment;
    private Logger LOGGER = LogManager.getLogger();

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        LOGGER.info("The hammer is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("The hammer is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("The hammer is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
