package com.threelm.vsgame.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.threelm.vsgame.model.army.Army;

import javax.inject.Singleton;

@Singleton
public class FireBaseRepositoryService extends Service {

    private static final String TAG = FireBaseRepositoryService.class.getSimpleName();

    private final static String ARMY_COLLECTION = "army";

    private FirebaseFirestore firebaseFirestore;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
        firebaseFirestore = FirebaseFirestore.getInstance();
        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                .setPersistenceEnabled(true)
                .build();
        firebaseFirestore.setFirestoreSettings(settings);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        Log.d(TAG, "onStartCommand");
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void addArmy(Army army) {
        firebaseFirestore.collection(Army.class.getSimpleName())
                .add(army)
                .addOnSuccessListener(new OnSuccessDocListener())
                .addOnFailureListener(new OnFailureDocListener());

    }

    private class OnSuccessDocListener implements OnSuccessListener<DocumentReference> {
        @Override
        public void onSuccess(DocumentReference documentReference) {
            Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
        }
    }

    private class OnFailureDocListener implements OnFailureListener {

        @Override
        public void onFailure(@NonNull Exception e) {
            Log.w(TAG, "Error adding document", e);
        }
    }
}
