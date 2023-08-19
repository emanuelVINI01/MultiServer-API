package com.emanuelvini.multiserver.shared.world.block;

import com.emanuelvini.multiserver.shared.material.MSMaterial;
import com.emanuelvini.multiserver.shared.world.location.MSLocation;

public interface MSBlock {


    MSLocation getLocation();

    MSMaterial getType();

    short getData();

    void setType(MSMaterial type);

    void setData(short data);


}
