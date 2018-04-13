package com.shree.dagger;

import android.app.Application;

import com.shree.dagger.di.Injector;

public class SampleApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.getInstance().init(this);
    }
}
