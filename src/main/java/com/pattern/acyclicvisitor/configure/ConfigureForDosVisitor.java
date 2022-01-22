package com.pattern.acyclicvisitor.configure;

import com.pattern.acyclicvisitor.visitor.AllModemVisitor;
import com.pattern.acyclicvisitor.domain.Hayes;
import com.pattern.acyclicvisitor.domain.Zoom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigureForDosVisitor implements AllModemVisitor {

    private final Logger logger = LogManager.getLogger();

    @Override
    public void visit(Hayes hayes) {
        logger.info(hayes + " used with Dos configurator.");
    }

    @Override
    public void visit(Zoom zoom) {
        logger.info(zoom + " used with Dos configurator.");
    }
}
