package com.emanuelvini.multiserver.common.entity;

import com.emanuelvini.multiserver.common.world.location.MSLocation;

import java.util.UUID;

public interface MSEntity {

    String getName();

    UUID getUUID();

    MSLocation getLocation();

    MSEntityType getType();



}
