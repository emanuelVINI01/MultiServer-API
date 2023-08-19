package com.emanuelvini.multiserver.bukkit.wrap.entity.player;

import com.emanuelvini.multiserver.bukkit.wrap.entity.game.GameModeWrapper;
import com.emanuelvini.multiserver.bukkit.wrap.world.location.LocationWrapper;
import com.emanuelvini.multiserver.shared.entity.MSEntityType;
import com.emanuelvini.multiserver.shared.entity.player.MSPlayer;
import com.emanuelvini.multiserver.shared.world.location.MSLocation;
import com.emanuelvini.multiserver.shared.world.mode.MSGameMode;
import org.bukkit.entity.Player;

import java.net.InetSocketAddress;
import java.util.UUID;

public class PlayerWrapper {

    public static MSPlayer wrap(Player player) {
        return new MSPlayer() {
            @Override
            public void sendMessage(String... messages) {
                player.sendMessage(messages);
            }

            @Override
            public boolean hasPermission(String permission) {
                return player.hasPermission(permission);
            }

            @Override
            public boolean isSneaking() {
                return player.isSneaking();
            }

            @Override
            public MSLocation getBedSpawnLocation() {
                return LocationWrapper.wrap(player.getBedSpawnLocation());
            }

            @Override
            public InetSocketAddress getAddress() {
                return player.getAddress();
            }

            @Override
            public MSGameMode getGameMode() {
                return GameModeWrapper.wrap(player.getGameMode());
            }

            @Override
            public void setBedSpawnLocation(MSLocation location) {
                player.setBedSpawnLocation(LocationWrapper.wrap(location));
            }

            @Override
            public void setGameMode(MSGameMode gameMode) {
                player.setGameMode(GameModeWrapper.wrap(gameMode));
            }

            @Override
            public MSLocation getLocation() {
                return LocationWrapper.wrap(player.getLocation());
            }

            @Override
            public MSEntityType getType() {
                return MSEntityType.PLAYER;
            }

            @Override
            public double getHealth() {
                return player.getHealth();
            }

            @Override
            public double getMaxHealth() {
                return player.getMaxHealth();
            }

            @Override
            public void setMaxHealth(double health) {
                player.setMaxHealth(health);
            }

            @Override
            public void setHealth(double health) {
                player.setHealth(health);
            }

            @Override
            public String getDisplayName() {
                return player.getDisplayName();
            }

            @Override
            public String getName() {
                return player.getName();
            }

            @Override
            public UUID getUUID() {
                return player.getUniqueId();
            }
        };
    }

}
