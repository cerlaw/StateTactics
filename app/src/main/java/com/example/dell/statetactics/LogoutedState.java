package com.example.dell.statetactics;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by DELL on 2017/6/4.
 */

public class LogoutedState implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void logout(Context context) {
        Toast.makeText(context,"已注销",Toast.LENGTH_SHORT).show();
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context,LoginActivity.class);
        context.startActivity(intent);
    }
}
