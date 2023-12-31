package com.emanuelvini.multiserver.shared.server;

import lombok.Getter;

public enum MSServerType {

    BUKKIT(0),
    BUNGEECORD(1);

    @Getter
    private final int id;
    MSServerType(int id) {
        this.id = id;
    }

}
