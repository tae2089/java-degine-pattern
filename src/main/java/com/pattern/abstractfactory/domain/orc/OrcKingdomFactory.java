package com.pattern.abstractfactory.domain.orc;

import com.pattern.abstractfactory.domain.Army;
import com.pattern.abstractfactory.domain.Castle;
import com.pattern.abstractfactory.domain.King;
import com.pattern.abstractfactory.domain.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
