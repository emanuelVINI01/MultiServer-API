package com.emanuelvini.multiserver.common.server.plugin;

import com.emanuelvini.multiserver.common.MSPlugin;

import java.io.File;

public interface MSPluginManager {

    void disablePlugin(MSPlugin plugin);

    void enablePlugin(MSPlugin plugin);

    MSPlugin loadPlugin(File file);

    MSPlugin getPlugin(String name);


}
