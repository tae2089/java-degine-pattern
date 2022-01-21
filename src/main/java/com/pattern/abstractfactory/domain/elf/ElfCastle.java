package com.pattern.abstractfactory.domain.elf;

import com.pattern.abstractfactory.domain.Castle;

public class ElfCastle implements Castle {
    private final String DESCRIPTION = "This is the elven castle!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
