package com.emanuelvini.multiserver.shared.entity;

import lombok.Getter;

public enum MSEntityType {

    PLAYER(0);

    @Getter
    private final int id;
    MSEntityType(int id) {
        this.id = id;
    }
}
