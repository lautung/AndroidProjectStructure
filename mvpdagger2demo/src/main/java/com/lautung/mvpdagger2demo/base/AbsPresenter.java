package com.lautung.mvpdagger2demo.base;

public abstract class AbsPresenter<M extends BaseModel, V extends BaseView> {
    private static final String TAG = AbsPresenter.class.getSimpleName();

//    @Inject
    protected M mModel;

//    @Inject
    protected V mView;

}
