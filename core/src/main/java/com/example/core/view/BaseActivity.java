package com.example.core.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    public void startActivity(Class<?> clazz){
        startActivity(new Intent(this,clazz));
    }

    public void startActivity(Class<?> clazz, Bundle bundle){
        Intent intent = new Intent(this, clazz);
        intent.putExtra("data",bundle);
        startActivity(intent);
    }

    public void showMsg(String msg){
        Toast.makeText(this, msg+"", Toast.LENGTH_SHORT).show();
    }

    public void showLongMsg(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示loading
     */
    public void showLoading(){

    }

    /**
     * 隐藏loading 隐藏实现
     */
    public void hideLoading(){

    }

}
