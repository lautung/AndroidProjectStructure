package com.lautung.mvpdemo01.ui.login;


import com.lautung.mvpdemo01.base.BasePresenter;
import com.lautung.mvpdemo01.base.BaseView;

public interface LoginContract {
    /**
     * 这里没有Model层，Presenter层充当了Model层的职责
     */
    interface Presenter extends BasePresenter {
        /**
         * 登录
         * @param mobile
         * @param password
         */
        void login(String mobile, String password);
    }

    interface View extends BaseView<Presenter> {
        /**
         * 登录成功
         *
         * @param result
         */
        void loginSuccess(String result);
    }
}
