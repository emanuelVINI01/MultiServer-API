package com.emanuelvini.multiserver.shared.world.mode;

import lombok.Getter;

public enum MSGameMode {

    SURVIVAL(0),
    CREATIVE(1),

    ADVENTURE(2),

    SPECTATOR(3);

    @Getter
    private final int id;
    MSGameMode(int id) {
        this.id = id;
    }

}
