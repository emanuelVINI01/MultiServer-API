package com.emanuelvini.multiserver.shared.entity;

import com.emanuelvini.multiserver.shared.world.location.MSLocation;

public interface MSEntity extends MSOfflineEntity {



    MSLocation getLocation();

    MSEntityType getType();

    double getHealth();

    double getMaxHealth();

    void setMaxHealth(double health);

    void setHealth(double health);

    default void kill() {
        setHealth(0.0);
    }


}
