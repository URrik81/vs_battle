package com.threelm.vsgame.model.player;

public class OwnerImpl implements Owner {

    private int color;
    //TODO - Country name should be get from Country or Lord models
    private String CountryName;

    @Override
    public int getOwnerColor() {
        return 0;
    }

    @Override
    public String getOwnerCountryName() {
        return null;
    }

}
