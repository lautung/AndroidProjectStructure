package com.lautung.mvpdagger2demo;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.lautung.mvpdagger2demo.di.AppComponent;
import com.lautung.mvpdagger2demo.di.AppModule;
import com.lautung.mvpdagger2demo.di.DaggerAppComponent;

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(Stetho.newInitializerBuilder(this).enableDumpapp(Stetho.defaultDumperPluginsProvider(this)).enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this)).build());

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();


    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
