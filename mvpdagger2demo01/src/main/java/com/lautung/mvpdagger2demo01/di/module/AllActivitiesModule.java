package com.lautung.mvpdagger2demo01.di.module;


import com.lautung.mvpdagger2demo01.ui.di.LoginActivityModule;
import com.lautung.mvpdagger2demo01.ui.di.RegisterActivityModule;
import com.lautung.mvpdagger2demo01.ui.login.LoginActivity;
import com.lautung.mvpdagger2demo01.ui.register.RegisterActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AllActivitiesModule {

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity contributeLoginActivityInjector();

    @ContributesAndroidInjector(modules = RegisterActivityModule.class)
    abstract RegisterActivity contributeRegisterActivityInjector();


}
