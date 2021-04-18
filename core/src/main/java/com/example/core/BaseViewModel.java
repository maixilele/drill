package com.example.core;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel<Repo extends BaseRepository> extends ViewModel implements LifecycleObserver {
    protected Repo mRepository;

    public BaseViewModel(){
        mRepository = createRepository();
    }

    protected abstract Repo createRepository();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void connView(){
        connectionView();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disConnView(){
        disConnectionView();
    }

    protected abstract void disConnectionView();


    protected abstract void connectionView();

}
