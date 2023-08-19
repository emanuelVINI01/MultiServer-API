package com.emanuelvini.multiserver.bukkit.server.plugin;


import com.emanuelvini.multiserver.shared.api.MSPlugin;
import com.emanuelvini.multiserver.shared.server.plugin.MSPluginManager;

import java.io.File;

public class BukkitPluginManager implements MSPluginManager {


    @Override
    public void disablePlugin(MSPlugin plugin) {

    }

    @Override
    public void enablePlugin(MSPlugin plugin) {

    }

    @Override
    public MSPlugin loadPlugin(File file) {
        return null;
    }

    @Override
    public MSPlugin getPlugin(String name) {
        return null;
    }
}
