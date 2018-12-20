package com.threelm.vsgame.modules.battle.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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

    Fragment startedFragment;

    private VsForumService vsForumService;

    @Override
    public void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        VsGameApplication.getVsGameComponent(this).inject(this);
        setContentView(R.layout.activity_battles);

        battlesActivityPresenter.setView(this);

        //Starts from select battle fragment
        if (startedFragment == null) {
            startedFragment = new SelectArmiesFragment();
        }
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_container, startedFragment, SelectArmiesFragment.TAG).addToBackStack(SelectArmiesFragment.TAG).commit();

        //Start service for forum
        //startService(new Intent(this, VsForumService.class));

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
