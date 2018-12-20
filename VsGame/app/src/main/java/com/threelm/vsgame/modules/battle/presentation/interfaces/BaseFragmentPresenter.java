package com.threelm.vsgame.modules.battle.presentation.interfaces;

import android.view.View;

import com.threelm.vsgame.modules.battle.ui.interfaces.BaseFragmentView;

public interface BaseFragmentPresenter<T extends BaseFragmentView> {
    void setView(T view);
    void onDestroyView();
}
