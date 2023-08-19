package com.emanuelvini.multiserver.shared.world;

import com.emanuelvini.multiserver.shared.world.chunk.MSChunk;
import com.emanuelvini.multiserver.shared.world.location.MSLocation;

import java.util.List;

public interface MSWorld {

    List<MSChunk> getLoadedChunks();

    MSLocation getSpawnPoint();

    void setSpawnPoint(MSLocation location);
}
