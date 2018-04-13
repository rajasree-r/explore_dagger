package com.shree.dagger.di;

import com.shree.dagger.Sum;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Singleton
    @Provides
    Sum provideSum() {
        return new Sum();
    }
}
