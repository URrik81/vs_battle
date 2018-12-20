package com.threelm.vsgame.modules.battle.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.threelm.vsgame.R;
import com.threelm.vsgame.VsGameApplication;
import com.threelm.vsgame.modules.battle.presentation.interfaces.SelectArmiesPresenter;
import com.threelm.vsgame.modules.battle.ui.interfaces.SelectArmiesFragmentView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectArmiesFragment extends Fragment implements SelectArmiesFragmentView {

    public static final String TAG = SelectArmiesFragment.class.getSimpleName();

    @Inject
    SelectArmiesPresenter selectArmiesPresenter;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup container, Bundle bundle) {
        super.onCreateView(layoutInflater, container, bundle);
        Log.d(TAG, "onCreateView called");
        VsGameApplication.getVsGameComponent(getContext()).inject(this);
        View view = layoutInflater.inflate(R.layout.select_armies_fragment, container, false);
        selectArmiesPresenter.setView(this);
        getActivity().setTitle(TAG);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.quick_battle_click)
    public void onQuickBattleClick() {
        Log.d(TAG, "onQuickBattleClick called");
        //go to battle 3 vs 3
        selectArmiesPresenter.goToQuickBattle();
    }
}
