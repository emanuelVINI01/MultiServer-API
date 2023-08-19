package com.emanuelvini.multiserver.bukkit.wrap.entity.game;

import com.emanuelvini.multiserver.shared.world.mode.MSGameMode;
import org.bukkit.GameMode;

public class GameModeWrapper {

    public static MSGameMode wrap(GameMode gameMode) {
        return MSGameMode.valueOf(gameMode.toString());
    }

    public static GameMode wrap(MSGameMode gameMode) {
        return GameMode.valueOf(gameMode.toString());
    }


}
