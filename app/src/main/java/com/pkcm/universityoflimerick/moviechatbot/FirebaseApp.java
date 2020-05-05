package com.pkcm.universityoflimerick.moviechatbot;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Promodkumar on 02-05-2020.
 */
public class FirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        com.google.firebase.FirebaseApp.initializeApp(this);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}