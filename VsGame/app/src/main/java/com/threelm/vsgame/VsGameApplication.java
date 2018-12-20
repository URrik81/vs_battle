package com.threelm.vsgame;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.threelm.vsgame.modules.battle.BattleModule;
import com.threelm.vsgame.services.FireBaseRepositoryService;

/**
 * Created by yurmor on 14.08.2017.
 */

public class VsGameApplication extends Application {

    protected VsGameComponent vsGameComponent;

    @Override
    public void onCreate() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(), FireBaseRepositoryService.class);
                startService(intent);

            }
        }).start();
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
