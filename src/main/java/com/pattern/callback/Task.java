package com.pattern.callback;

import java.util.Optional;

public interface Task {

    public default  void executWith(CallBack callBack) {
        execute();
        Optional.ofNullable(callBack).ifPresent(CallBack::call);
    }

    public abstract void execute();
}
