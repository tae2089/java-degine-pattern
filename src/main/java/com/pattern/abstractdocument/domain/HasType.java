package com.pattern.abstractdocument.domain;

import com.pattern.abstractdocument.Document;
import com.pattern.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasType extends Document {
    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.toString()));
    }
}
