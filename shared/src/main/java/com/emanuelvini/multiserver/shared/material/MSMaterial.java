package com.emanuelvini.multiserver.shared.material;

import lombok.Getter;

public enum MSMaterial {

    AIR(0),
    STONE(1);

    @Getter
    private final int id;
    MSMaterial(int id) {
        this.id = id;
    }

}
