package com.threelm.vsgame.modules.battle.presentation.interfaces;

import com.threelm.vsgame.model.army.Army;

import java.util.ArrayList;

public interface SelectArmiesPresenter {

    void goToBattleGround(ArrayList<Army> yourArmies, ArrayList<Army> enemyArmies);
}
