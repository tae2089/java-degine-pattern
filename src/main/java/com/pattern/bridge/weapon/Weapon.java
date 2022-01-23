package com.pattern.bridge.weapon;

import com.pattern.bridge.enchant.Enchantment;

public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
