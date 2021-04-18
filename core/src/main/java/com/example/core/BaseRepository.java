package com.example.core;

public abstract class BaseRepository<M extends IModel> {
    protected M mModel;

    public BaseRepository(){
        mModel = createModel();
    }

    protected abstract M createModel();

}
