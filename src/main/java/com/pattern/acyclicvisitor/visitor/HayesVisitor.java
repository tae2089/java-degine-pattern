package com.pattern.acyclicvisitor.visitor;

import com.pattern.acyclicvisitor.domain.Hayes;

public interface HayesVisitor {
    void visit(Hayes hayes);
}
