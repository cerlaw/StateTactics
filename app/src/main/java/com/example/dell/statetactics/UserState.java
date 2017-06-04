package com.example.dell.statetactics;

import android.content.Context;

/**
 * Created by DELL on 2017/6/4.
 */

public interface UserState {

    public void forward(Context context);

    public void comment(Context context);

    public void logout(Context context);
}
