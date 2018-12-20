package com.threelm.vsgame.modules.battle;

import com.threelm.vsgame.modules.battle.presentation.BattlesActivityPresenterImpl;
import com.threelm.vsgame.modules.battle.presentation.SelectArmiesPresenterImpl;
import com.threelm.vsgame.modules.battle.presentation.interfaces.BattlesActivityPresenter;
import com.threelm.vsgame.modules.battle.presentation.interfaces.SelectArmiesPresenter;
import com.threelm.vsgame.modules.battle.repository.BattlesRepositoryImpl;
import com.threelm.vsgame.modules.battle.repository.interfaces.BattlesRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yurmor on 14.08.2017.
 */
@Module
public class BattleModule {

    //Presenters
    @Singleton
    @Provides
    BattlesActivityPresenter provideBattlesActivityPresenter() {
        return new BattlesActivityPresenterImpl();
    }

    @Singleton
    @Provides
    SelectArmiesPresenter provideSelectArmiesPresenter() {
        return new SelectArmiesPresenterImpl();
    }

    //Repository
    @Singleton
    @Provides
    BattlesRepository provideBattlesRepository() {
        return new BattlesRepositoryImpl();
    }
}
