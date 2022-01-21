package com.pattern.abstractdocument.domain;

import com.pattern.abstractdocument.Document;
import com.pattern.abstractdocument.domain.enums.Property;

import java.util.Optional;

public interface HasModel extends Document {
    default Optional<String> getModel(){
        return Optional.ofNullable((String) get(Property.MODEL.toString()));
    }
}
