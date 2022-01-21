package com.pattern.abstractfactory.domain.orc;

import com.pattern.abstractfactory.domain.Castle;


public class OrcCastle implements Castle {
    private final String DESCRIPTION = "This is the orc Castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
