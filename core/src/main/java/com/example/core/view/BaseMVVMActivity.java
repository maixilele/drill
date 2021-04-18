package com.example.core.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.core.BaseViewModel;

public abstract class BaseMVVMActivity<VM extends BaseViewModel,V extends ViewDataBinding> extends BaseActivity {

    protected VM mViewModel;
    protected V mV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mV= DataBindingUtil.setContentView(this, getLayoutId());
        mV.setVariable(getVariable(),createViewModel());
        mV.setLifecycleOwner(this);
    }

    /**
     * 获取数据源
     */
    protected abstract int getVariable();

    /**
     * 获取子类布局文件id
     */
    protected abstract int getLayoutId();

    /**
     * 创建ViewModel
     */
    protected abstract VM createViewModel();

}
