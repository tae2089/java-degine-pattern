package com.pattern.acyclicvisitor.domain;

import com.pattern.acyclicvisitor.visitor.ModemVisitor;
import com.pattern.acyclicvisitor.visitor.ZoomVisitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zoom extends Modem {
    private final Logger logger = LogManager.getLogger();
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZoomVisitor) {
            ((ZoomVisitor) modemVisitor).visit(this);
        }else{
            logger.info("Only ZoomVisitor is allowed to visit Zoom modem");
        }
    }

    @Override
    public String toString() {
        return "Zoom Modem";
    }
}
