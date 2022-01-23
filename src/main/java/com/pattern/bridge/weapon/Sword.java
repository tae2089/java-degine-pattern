package com.pattern.bridge.weapon;

import com.pattern.bridge.enchant.Enchantment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sword implements  Weapon{

    private Enchantment enchantment;
    private static Logger LOGGER = LogManager.getLogger();

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        LOGGER.info("The sword is wielded.");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        LOGGER.info("The sword is swinged.");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        LOGGER.info("The sword is unwielded.");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
