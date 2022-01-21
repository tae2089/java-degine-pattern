package com.pattern.abstractfactory.domain.elf;

import com.pattern.abstractfactory.domain.King;

public class ElfKing implements King {
    private final String DESCRIPTION = "This is the elven king!";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
