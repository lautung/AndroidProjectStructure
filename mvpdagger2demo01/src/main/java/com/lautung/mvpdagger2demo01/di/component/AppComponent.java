package com.lautung.mvpdagger2demo01.di.component;


import com.lautung.mvpdagger2demo01.App;
import com.lautung.mvpdagger2demo01.di.module.AllActivitiesModule;
import com.lautung.mvpdagger2demo01.di.module.AppModule;
import com.lautung.mvpdagger2demo01.network.api.WanAndroidApi;
import com.lautung.mvpdagger2demo01.network.di.ApiServiceModule;
import com.lautung.mvpdagger2demo01.network.di.HttpModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

//@Singleton
@Component(modules = {AndroidInjectionModule.class
        , AndroidSupportInjectionModule.class
        , AllActivitiesModule.class
        , AppModule.class
        , HttpModule.class
        , ApiServiceModule.class})
public interface AppComponent {

    void inject(App application);

    WanAndroidApi getWanAndroidApi();
}
