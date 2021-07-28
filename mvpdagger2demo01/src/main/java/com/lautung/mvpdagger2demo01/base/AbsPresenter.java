package com.lautung.mvpdagger2demo01.base;

public abstract class AbsPresenter<M extends BaseModel, V extends BaseView> {
    private static final String TAG = AbsPresenter.class.getSimpleName();

    protected M mModel;

    protected V mView;

}
