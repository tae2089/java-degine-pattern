package com.pattern.abstractfactory;

import com.pattern.abstractfactory.domain.Kingdom;
import com.pattern.abstractfactory.domain.KingdomFactory;
import com.pattern.abstractfactory.domain.enums.KingdomType;
import com.pattern.abstractfactory.domain.elf.ElfKingdomFactory;
import com.pattern.abstractfactory.domain.orc.OrcKingdomFactory;

public class FactoryMaker {
    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }
}
