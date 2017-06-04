package com.example.dell.statetactics;

import android.content.Context;

/**
 * Created by DELL on 2017/6/4.
 */

public class LoginContext {

    UserState mState = new LogoutedState();

    static LoginContext sLoginContext = new LoginContext();

    private LoginContext(){

    }

    public static LoginContext getLoginContext(){
        return sLoginContext;
    }

    public void setState(UserState state){
        mState = state;
    }

    public UserState getState(){
        return mState;
    }

    public void forward(Context context){
        mState.forward(context);
    }

    public void comment(Context context){
        mState.comment(context);
    }

    public void logout(Context context){
        mState.logout(context);
    }
}
