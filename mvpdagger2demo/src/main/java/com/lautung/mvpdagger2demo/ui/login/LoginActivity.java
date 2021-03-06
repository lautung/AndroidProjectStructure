package com.lautung.mvpdagger2demo.ui.login;


import com.lautung.mvpdagger2demo.R;
import com.lautung.mvpdagger2demo.base.BaseActivity;
import com.lautung.mvpdagger2demo.ui.UIUtils;
import com.lautung.mvpdagger2demo.ui.login.di.DaggerLoginComponent;
import com.lautung.mvpdagger2demo.ui.login.di.LoginModule;

public class LoginActivity extends BaseActivity<LoginContract.Presenter> {


    @Override
    protected int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initData() {

        LoginFragment loginFragment = (LoginFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrameLayout);
        if (loginFragment == null) {
            loginFragment = LoginFragment.newInstance();
            UIUtils.addFragmentToActivity(getSupportFragmentManager(), loginFragment, R.id.contentFrameLayout);
        }

        DaggerLoginComponent.builder()
                .appComponent(mApplication.getAppComponent())
                .loginModule(new LoginModule(loginFragment))
                .build()
                .inject(this);

    }
}
