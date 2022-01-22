package com.pattern.acyclicvisitor.domain;

import com.pattern.acyclicvisitor.visitor.ModemVisitor;

public abstract class Modem {
    public abstract void accept(ModemVisitor modemVisitor);
}
