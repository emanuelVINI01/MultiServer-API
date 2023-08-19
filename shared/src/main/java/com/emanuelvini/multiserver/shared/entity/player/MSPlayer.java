package com.emanuelvini.multiserver.shared.entity.player;

import com.emanuelvini.multiserver.shared.entity.MSEntity;
import com.emanuelvini.multiserver.shared.world.location.MSLocation;
import com.emanuelvini.multiserver.shared.world.mode.MSGameMode;

import java.net.InetSocketAddress;

public interface MSPlayer extends MSEntity, MSOfflinePlayer {

    void sendMessage(String... messages);

    boolean hasPermission(String permission);

    boolean isSneaking();

    MSLocation getBedSpawnLocation();

    InetSocketAddress getAddress();

    MSGameMode getGameMode();

    void setBedSpawnLocation(MSLocation location);

    void setGameMode(MSGameMode gameMode);



}
