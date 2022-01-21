package com.pattern.abstractdocument;


import java.util.List;
import java.util.Map;

import com.pattern.abstractdocument.domain.Car;
import com.pattern.abstractdocument.domain.enums.Property;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;




public class App {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String []args){
        LOGGER.info("Constructing parts and car");
        var wheelProperties = Map.of(
                Property.TYPE.toString(),"wheel",
                Property.MODEL.toString(),"wheel",
                Property.PRICE.toString(),123L
        );
        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 300L);

        var carProperties = Map.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties));

        var car = new Car(carProperties);

        LOGGER.info("Here is our car:");
        LOGGER.info("-> model: {}", car.getModel().orElseThrow());
        LOGGER.info("-> price: {}", car.getPrice().orElseThrow());
        LOGGER.info("-> parts: ");
        car.getParts().forEach(p -> LOGGER.info("\t{}/{}/{}",
                p.getType().orElse(null),
                p.getModel().orElse(null),
                p.getPrice().orElse(null))
        );

    }



}
