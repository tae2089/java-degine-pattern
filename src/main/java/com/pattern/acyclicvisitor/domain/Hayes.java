package com.pattern.acyclicvisitor.domain;

import com.pattern.acyclicvisitor.visitor.HayesVisitor;
import com.pattern.acyclicvisitor.visitor.ModemVisitor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hayes extends Modem{

    private final Logger logger = LogManager.getLogger();

    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof HayesVisitor) {
            ((HayesVisitor)modemVisitor).visit(this);
        }else{
            logger.info("Only HayesVisitor is allowed to visit Hayes modem");
        }
    }

    @Override
    public String toString() {
        return "Hayes Modem";
    }
}
