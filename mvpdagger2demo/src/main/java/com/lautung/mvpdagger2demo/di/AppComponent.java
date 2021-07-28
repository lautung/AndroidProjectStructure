package com.lautung.mvpdagger2demo.di;

import android.app.Application;

import com.lautung.mvpdagger2demo.network.api.WanAndroidApi;
import com.lautung.mvpdagger2demo.network.di.ApiServiceModule;
import com.lautung.mvpdagger2demo.network.di.HttpModule;

import dagger.Component;

//@Singleton
@Component(modules = {AppModule.class, HttpModule.class, ApiServiceModule.class})
public interface AppComponent {

    Application application();

    WanAndroidApi getWanAndroidApi();
}
