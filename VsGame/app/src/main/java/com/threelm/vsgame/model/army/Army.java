package com.threelm.vsgame.model.army;

public interface Army {
    enum Advantage {
        LOW, //is always defeated by  HIGH, defeated by NORMAL if equal
        NORMAL,//defeated by HIGH if equal
        HIGH
    }

    int getStrength();

    Advantage getAdvantage();

    String getOwnerName();
}
