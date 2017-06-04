package com.example.dell.statetactics;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by DELL on 2017/6/4.
 */

public class LoginedState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context,"转发微博",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context,"评论微博",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void logout(Context context) {
        Toast.makeText(context,"注销成功",Toast.LENGTH_SHORT).show();
    }
}
