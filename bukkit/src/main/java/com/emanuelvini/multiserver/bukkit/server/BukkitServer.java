package com.emanuelvini.multiserver.bukkit.server;

import com.emanuelvini.multiserver.shared.entity.player.MSPlayer;
import com.emanuelvini.multiserver.shared.server.MSServer;
import com.emanuelvini.multiserver.shared.server.MSServerType;
import com.emanuelvini.multiserver.shared.server.plugin.MSPluginManager;
import org.bukkit.Bukkit;
import org.bukkit.Server;

import java.util.List;

public class BukkitServer implements MSServer {

    private final Server server = Bukkit.getServer();
    @Override
    public MSPluginManager getPluginManager() {
        return null;
    }

    @Override
    public List<MSPlayer> getOnlinePlayers() {
        return ;
    }

    @Override
    public MSServerType getServerType() {
        return MSServerType.BUKKIT;
    }

    @Override
    public void shutdown() {
        server.shutdown();
    }
}
