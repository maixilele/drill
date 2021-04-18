package com.example.core.view;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.core.BaseViewModel;

public abstract class BaseMVVMActivity<VM extends BaseViewModel> extends BaseActivity {

    protected VM mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLayoutId();
        createViewModel();
    }

    /**
     * 获取子类布局文件id
     * @return
     */
    protected abstract int getLayoutId();

    protected abstract void createViewModel();

}
