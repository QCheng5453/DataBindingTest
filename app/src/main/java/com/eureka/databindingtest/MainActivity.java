package com.eureka.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eureka.databindingtest.data.User;
import com.eureka.databindingtest.databinding.ActivityMainBinding;
import com.eureka.databindingtest.utils.Handlers;
import com.eureka.databindingtest.utils.Presenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("EureKA", "" + 23, false);
        binding.setUser(user);

        Handlers handlers = new Handlers();
        binding.setHandlers(handlers);

        Presenter presenter = new Presenter();
        binding.setPresenter(presenter);
    }

}
