package com.threelm.vsgame;

import android.app.Application;
import android.content.Context;

import com.threelm.vsgame.modules.battle.BattleModule;

/**
 * Created by yurmor on 14.08.2017.
 */

public class VsGameApplication extends Application {

    protected VsGameComponent vsGameComponent;

    @Override
    public void onCreate() {
        initComponent();
        super.onCreate();
    }

    protected void initComponent() {
        vsGameComponent = DaggerVsGameComponent.builder()
                .battleModule(new BattleModule())
                .build();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static VsGameComponent getVsGameComponent(Context context) {
        VsGameApplication vsGameApplication = (VsGameApplication) context.getApplicationContext();
        vsGameApplication.initComponent();
        return vsGameApplication.vsGameComponent;
    }
}
