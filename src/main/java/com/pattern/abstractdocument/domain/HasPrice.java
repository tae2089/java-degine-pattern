package com.pattern.abstractdocument.domain;

import com.pattern.abstractdocument.Document;
import com.pattern.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasPrice extends Document {
    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.toString()));
    }
}
