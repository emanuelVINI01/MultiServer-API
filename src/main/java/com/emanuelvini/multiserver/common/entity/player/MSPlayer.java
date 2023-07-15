package com.emanuelvini.multiserver.common.entity.player;

import com.emanuelvini.multiserver.common.entity.MSEntity;

import java.util.UUID;

public interface MSPlayer extends MSEntity {

    void sendMessage(String... messages);

    boolean hasPermission(String permission);


}
