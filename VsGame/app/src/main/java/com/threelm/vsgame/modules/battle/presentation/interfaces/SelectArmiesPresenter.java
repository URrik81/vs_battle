package com.threelm.vsgame.modules.battle.presentation.interfaces;

import com.threelm.vsgame.model.army.Army;
import com.threelm.vsgame.modules.battle.ui.interfaces.SelectArmiesFragmentView;

import java.util.ArrayList;

public interface SelectArmiesPresenter extends BaseFragmentPresenter<SelectArmiesFragmentView>{

    void goToBattleGround(ArrayList<Army> yourArmies, ArrayList<Army> enemyArmies);

    void goToQuickBattle();
}
