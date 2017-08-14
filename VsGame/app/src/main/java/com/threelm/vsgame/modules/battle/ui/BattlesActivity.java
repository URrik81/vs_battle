package com.threelm.vsgame.modules.battle.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.threelm.vsgame.R;
import com.threelm.vsgame.modules.battle.ui.interfaces.BattlesActivityView;

public class BattlesActivity extends AppCompatActivity
implements BattlesActivityView {


    @Override
    public void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.activity_battles);
    }
}
