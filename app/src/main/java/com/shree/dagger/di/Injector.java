package com.shree.dagger.di;

import android.app.Activity;
import android.content.Context;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class Injector implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    private static final Injector INSTANCE = new Injector();

    public void init(final Context context){
        beginInjection(context);
    }

    private Injector(){}

    public static Injector getInstance(){
        return INSTANCE;
    }

    private void beginInjection(final Context context){
        DaggerMainComponent.builder().context(context).injector(this).build();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingActivityInjector;
    }
}
