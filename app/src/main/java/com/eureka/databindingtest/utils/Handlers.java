package com.eureka.databindingtest.utils;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * usage
 *
 * @author cheng.qian.
 * @date 2016/9/18.
 * ============================================
 * Copyright (c) 2016 TRANSSION.Co.Ltd.
 * All right reserved.
 **/

public class Handlers {
    public void onClicked(View view) {
        Context context = view.getContext();
        Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
    }

}
