package com.threelm.vsgame.modules.battle.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.threelm.vsgame.R;
import com.threelm.vsgame.VsGameApplication;
import com.threelm.vsgame.modules.battle.presentation.interfaces.BattlesActivityPresenter;
import com.threelm.vsgame.modules.battle.ui.interfaces.BattlesActivityView;
import com.threelm.vsgame.services.VsForumService;

import javax.inject.Inject;

public class BattlesActivity extends AppCompatActivity
implements BattlesActivityView {

    @Inject
    BattlesActivityPresenter battlesActivityPresenter;

    private VsForumService vsForumService;

    @Override
    public void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        VsGameApplication.getVsGameComponent(this).inject(this);
        setContentView(R.layout.activity_battles);

        startService(new Intent(this, VsForumService.class));

    }
}
