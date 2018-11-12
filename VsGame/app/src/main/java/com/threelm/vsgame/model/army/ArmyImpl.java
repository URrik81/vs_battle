package com.threelm.vsgame.model.army;

import android.support.annotation.NonNull;

import com.threelm.vsgame.model.player.Owner;

public class ArmyImpl implements Army {

    private int strength;
    private Advantage advantage;
    private Owner owner;

    public ArmyImpl(int strength, @NonNull Owner owner) {
        this(strength, Advantage.NORMAL, owner);
    }

    public ArmyImpl(int strength, Advantage advantage, @NonNull Owner owner) {
        this.strength = strength;
        this.advantage = advantage;
        this.owner = owner;
    }

    public void changeAdvantage(Advantage advantage) {
        this.advantage = advantage;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public Advantage getAdvantage() {
        return advantage;
    }

    @Override
    public String getOwnerName() {
        return owner.getOwnerCountryName();
    }
}
