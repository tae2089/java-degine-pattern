package com.pattern.abstractfactory.domain.orc;

import com.pattern.abstractfactory.domain.King;

public class OrcKing implements King {
    private final String DESCRIPTION = "This is the orc King!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
