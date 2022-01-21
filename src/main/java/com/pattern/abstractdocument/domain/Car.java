package com.pattern.abstractdocument.domain;

import com.pattern.abstractdocument.AbstractDocument;

import java.util.Map;

public class Car extends AbstractDocument implements HasModel,HasPrice,HasParts,HasType {
    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
