package com.pattern.abstractfactory.domain;

public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
