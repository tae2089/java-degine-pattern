package com.pattern.abstractfactory.domain.elf;

import com.pattern.abstractfactory.domain.Army;
import com.pattern.abstractfactory.domain.Castle;
import com.pattern.abstractfactory.domain.King;
import com.pattern.abstractfactory.domain.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
