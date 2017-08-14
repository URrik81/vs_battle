package com.threelm.vsgame;

/**
 * Created by yurmor on 14.08.2017.
 */

import com.threelm.vsgame.modules.battle.BattleModule;
import com.threelm.vsgame.modules.battle.ui.BattlesActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        BattleModule.class
})

@Singleton
interface VsGameComponent {
    void inject(BattlesActivity activity);
}
