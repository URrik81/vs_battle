package com.threelm.vsgame.modules.battle.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SelectArmiesFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup container, Bundle bundle) {
        super.onCreateView(layoutInflater, container, bundle);
        layoutInflater.inflate(android.support.v4.R.layout, container, false);//TODO add layout
    }
}
