package com.eureka.databindingtest.utils;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.eureka.databindingtest.MainActivity;
import com.eureka.databindingtest.data.User;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/18.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class Presenter {
    public void onClickWithData(View view, User user) {
        Context context = view.getContext();
        Toast.makeText(context,"onClicked show name " + user.getName(),Toast.LENGTH_SHORT).show();

    }
}
