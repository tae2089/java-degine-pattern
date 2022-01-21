package com.pattern.abstractdocument.domain;

import com.pattern.abstractdocument.Document;
import com.pattern.abstractdocument.domain.enums.Property;

import java.util.stream.Stream;

public interface HasParts extends Document {
    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
