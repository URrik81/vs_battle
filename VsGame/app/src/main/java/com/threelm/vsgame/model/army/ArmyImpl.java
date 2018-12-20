package com.threelm.vsgame.model.army;

import android.support.annotation.NonNull;

import com.threelm.vsgame.model.player.Owner;
import com.threelm.vsgame.model.player.OwnerImpl;

public class ArmyImpl implements Army {

    private int strength;
    private Advantage advantage;
    private Owner owner;

    public ArmyImpl() {
         strength = 0;
         advantage = Advantage.NORMAL;
         owner = new OwnerImpl();
    }

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

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public Advantage getAdvantage() {
        return advantage;
    }

    public void setAdvantage(Advantage advantage) {
        this.advantage = advantage;
    }

    @Override
    public String getOwnerName() {
        return owner.getCountryName();
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
