package com.emanuelvini.multiserver.shared.server;

import lombok.SneakyThrows;

public class MSServerInstance {


    private static MSServer instance;

    public static MSServer get() {
        return instance;
    }

    @SneakyThrows
    public static void setInstance(MSServer server) {
        if (instance != null) {
            throw new RuntimeException("You can't set already defined server at MSServerInstance.");
        } else {
            instance = server;
        }
    }

}
