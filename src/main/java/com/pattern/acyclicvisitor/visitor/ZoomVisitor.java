package com.pattern.acyclicvisitor.visitor;

import com.pattern.acyclicvisitor.domain.Zoom;

public interface ZoomVisitor extends ModemVisitor{
    void visit(Zoom zoom);
}
