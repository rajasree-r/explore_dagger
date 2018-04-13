package com.shree.dagger.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        MainModule.class,
        ActivityModule.class
})
public interface MainComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder injector(Injector injector);

        @BindsInstance
        Builder context(Context context);

        MainComponent build();
    }
}
