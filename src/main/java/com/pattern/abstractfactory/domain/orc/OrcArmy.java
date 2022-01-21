package com.pattern.abstractfactory.domain.orc;

import com.pattern.abstractfactory.domain.Army;

public class OrcArmy implements Army {
    private final String DESCRIPTION = "This is the orc Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
