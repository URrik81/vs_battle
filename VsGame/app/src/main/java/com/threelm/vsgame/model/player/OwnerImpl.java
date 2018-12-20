package com.threelm.vsgame.model.player;

public class OwnerImpl implements Owner {

    private int color;
    //TODO - Country name should be get from Country or Lord models
    private String countryName;

    public OwnerImpl() {
        color = 0x000000;
        countryName = "Unknown";
    }

    public OwnerImpl(boolean isAttcker) {
        this.color = isAttcker ? 0x00FF00 : 0x0000FF;
        this.countryName = isAttcker ? "Attacker" : "Defender";
    }

    public OwnerImpl(int color, String countryName) {
        this.color = color;
        this.countryName = countryName;
    }

    @Override
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
