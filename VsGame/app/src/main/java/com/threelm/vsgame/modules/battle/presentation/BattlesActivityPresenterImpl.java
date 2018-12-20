package com.threelm.vsgame.modules.battle.presentation;

import com.threelm.vsgame.modules.battle.presentation.interfaces.BattlesActivityPresenter;
import com.threelm.vsgame.modules.battle.ui.interfaces.BattlesActivityView;

/**
 * Created by yurmor on 14.08.2017.
 */

public class BattlesActivityPresenterImpl implements BattlesActivityPresenter {

    BattlesActivityView battlesActivityView;

    @Override
    public void setView(BattlesActivityView battlesActivityView) {
        this.battlesActivityView = battlesActivityView;
    }
}
