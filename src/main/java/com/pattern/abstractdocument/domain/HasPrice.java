package com.pattern.abstractdocument.domain;

import com.pattern.abstractdocument.Document;
import com.pattern.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasPrice extends Document {
    default Optional<Long> getPrice() {
        return Optional.ofNullable((Long) get(Property.PRICE.toString()));
    }
}
