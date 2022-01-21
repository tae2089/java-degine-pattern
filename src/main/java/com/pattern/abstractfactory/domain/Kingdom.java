package com.pattern.abstractfactory.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;
}
