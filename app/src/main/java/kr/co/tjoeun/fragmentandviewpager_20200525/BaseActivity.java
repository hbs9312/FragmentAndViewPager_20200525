package kr.co.tjoeun.fragmentandviewpager_20200525;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvent();
    public abstract void setValues();

}
