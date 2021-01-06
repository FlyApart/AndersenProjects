package com.andersen.patterns.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> privileges);
}
