package com.threelm.vsgame.modules.battle.presentation;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.threelm.vsgame.model.army.Army;
import com.threelm.vsgame.model.army.ArmyImpl;
import com.threelm.vsgame.model.player.OwnerImpl;
import com.threelm.vsgame.modules.battle.presentation.interfaces.SelectArmiesPresenter;
import com.threelm.vsgame.modules.battle.ui.interfaces.SelectArmiesFragmentView;

import java.util.ArrayList;

public class SelectArmiesPresenterImpl implements SelectArmiesPresenter {

    private static final String TAG = SelectArmiesPresenterImpl.class.getSimpleName();
    SelectArmiesFragmentView view;

    @Override
    public void goToBattleGround(ArrayList<Army> yourArmies, ArrayList<Army> enemyArmies) {
    }

    @Override
    public void goToQuickBattle() {
        Log.d(TAG, "goToQuickBattle called");
        firebaseFirestore.collection("armies")
                .add(new ArmyImpl(3, new OwnerImpl(true)))
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
        firebaseFirestore.collection("armies")
                .add(new ArmyImpl(3, new OwnerImpl(false)))
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });
    }

    @Override
    public void setView(SelectArmiesFragmentView view) {
        this.view = view;
    }

    @Override
    public void onDestroyView() {
        view = null;
    }
}
