package com.emanuelvini.multiserver.shared.server;

import com.emanuelvini.multiserver.shared.entity.player.MSPlayer;
import com.emanuelvini.multiserver.shared.server.plugin.MSPluginManager;

import java.util.List;

public interface MSServer {
    MSPluginManager getPluginManager();

    List<MSPlayer> getOnlinePlayers();

    MSServerType getServerType();

    void shutdown();




}
