package com.pattern.acyclicvisitor;

import com.pattern.acyclicvisitor.configure.ConfigureForDosVisitor;
import com.pattern.acyclicvisitor.configure.ConfigureForUnixVisitor;
import com.pattern.acyclicvisitor.domain.Hayes;
import com.pattern.acyclicvisitor.domain.Zoom;

public class App {
    public static void main(String[] args) {
        var conUnix = new ConfigureForUnixVisitor();
        var conDos = new ConfigureForDosVisitor();
        var zoom = new Zoom();
        var hayes = new Hayes();
        hayes.accept(conDos);
        zoom.accept(conDos);
        hayes.accept(conUnix);
        zoom.accept(conUnix);
    }
}
