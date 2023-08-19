package com.emanuelvini.multiserver.shared.server.plugin;

import com.emanuelvini.multiserver.shared.api.MSPlugin;

import java.io.File;

public interface MSPluginManager {

    void disablePlugin(MSPlugin plugin);

    void enablePlugin(MSPlugin plugin);

    MSPlugin loadPlugin(File file);

    MSPlugin getPlugin(String name);


}
