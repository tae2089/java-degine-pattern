package com.pattern.bridge;

import com.pattern.bridge.enchant.FlyingEnchantment;
import com.pattern.bridge.enchant.SoulEnchanment;
import com.pattern.bridge.weapon.Hammer;
import com.pattern.bridge.weapon.Sword;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        LOGGER.info("The knight receives an enchanted sword.");
        var enchantedSword = new Sword(new SoulEnchanment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        LOGGER.info("The valkyrie receives an enchanted hammer.");
        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
