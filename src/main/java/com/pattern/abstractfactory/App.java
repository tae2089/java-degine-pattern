package com.pattern.abstractfactory;

import com.pattern.abstractfactory.domain.Kingdom;
import com.pattern.abstractfactory.domain.KingdomFactory;
import com.pattern.abstractfactory.domain.enums.KingdomType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App implements Runnable{
    private static final Logger LOGGER = LogManager.getLogger();

    private final Kingdom kingdom = new Kingdom();

    public Kingdom getKingdom(){
        return this.kingdom;
    }

    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("elf kingdom");
        createKingdom(KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());

        LOGGER.info("orc kingdom");
        createKingdom(KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
    }

    /**
     * Creates kingdom.
     * @param kingdomType type of Kingdom
     */
    public void createKingdom(KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}
