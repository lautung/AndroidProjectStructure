package com.lautung.mvpdagger2demo01.di.module;


import android.app.Application;


import com.lautung.mvpdagger2demo01.App;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    public AppModule(App application) {
        this.mApplication = application;
    }

    private Application mApplication;

//    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }
}
