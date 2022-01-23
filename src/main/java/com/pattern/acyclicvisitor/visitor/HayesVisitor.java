package com.pattern.acyclicvisitor.visitor;

import com.pattern.acyclicvisitor.domain.Hayes;

public interface HayesVisitor extends ModemVisitor{
    void visit(Hayes hayes);
}
