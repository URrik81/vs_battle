package com.threelm.vsgame;

/**
 * Created by yurmor on 14.08.2017.
 */

import com.threelm.vsgame.modules.battle.BattleModule;
import com.threelm.vsgame.modules.battle.ui.BattlesActivity;
import com.threelm.vsgame.modules.battle.ui.SelectArmiesFragment;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        BattleModule.class
})

@Singleton
public interface VsGameComponent {
    void inject(BattlesActivity activity);

    void inject(SelectArmiesFragment fragment);
}
