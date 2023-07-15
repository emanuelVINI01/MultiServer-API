package com.emanuelvini.multiserver.common.world.block;

import com.emanuelvini.multiserver.common.material.MSMaterial;
import com.emanuelvini.multiserver.common.world.location.MSLocation;

public interface MSBlock {


    MSLocation getLocation();

    MSMaterial getMaterial();

}
