
package com.myproject.framework.mvp.ui.splash;

import com.myproject.framework.mvp.data.DataManager;
import com.myproject.framework.mvp.ui.base.BasePresenter;
import com.myproject.framework.mvp.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Nhat on 12/13/17.
 */


public class SplashPresenter<V extends SplashBaseView> extends BasePresenter<V>
        implements SplashMvpPresenter<V> {

    @Inject
    public SplashPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

    }

    private void decideNextActivity() {
        if (getDataManager().getCurrentUserLoggedInMode()
                == DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()) {
            getMvpView().openLoginActivity();
        } else {
            getMvpView().openMainActivity();
        }
    }
}
