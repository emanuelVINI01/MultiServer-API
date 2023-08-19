package com.emanuelvini.multiserver.shared.world.chunk;

import com.emanuelvini.multiserver.shared.entity.MSEntity;
import com.emanuelvini.multiserver.shared.world.block.MSBlock;

import java.util.List;

public interface MSChunk {

    List<MSBlock> getBlocks();

    List<MSEntity> getEntities();


}
