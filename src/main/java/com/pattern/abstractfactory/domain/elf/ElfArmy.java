package com.pattern.abstractfactory.domain.elf;

import com.pattern.abstractfactory.domain.Army;

public class ElfArmy implements Army {
    private final String DESCRIPTION = "This is the elven Army!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
