package com.threelm.vsgame.modules.battle.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.threelm.vsgame.R;
import com.threelm.vsgame.modules.battle.presentation.interfaces.SelectArmiesPresenter;

import javax.inject.Inject;

import butterknife.OnClick;

public class SelectArmiesFragment extends Fragment {

    @Inject
    SelectArmiesPresenter selectArmiesPresenter;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup container, Bundle bundle) {
        super.onCreateView(layoutInflater, container, bundle);
        return layoutInflater.inflate(R.layout.select_armies_fragment, container, false);
    }

    @OnClick(R.id.quick_battle_click)
    public void onQuickBattleClick() {
        //go to battle 3 vs 3

    }
}
