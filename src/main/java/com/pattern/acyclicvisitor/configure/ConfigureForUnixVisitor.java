package com.pattern.acyclicvisitor.configure;

import com.pattern.acyclicvisitor.visitor.ZoomVisitor;
import com.pattern.acyclicvisitor.domain.Zoom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigureForUnixVisitor implements ZoomVisitor {

    private final Logger logger = LogManager.getLogger();

    @Override
    public void visit(Zoom zoom) {
        logger.info(zoom + " used with Unix configurator.");
    }
}
