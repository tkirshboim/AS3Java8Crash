package com.kirshboim.as3java8issue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This does not crash
        Map<String, String> map = new ConcurrentHashMap<>();
        map.keySet();

        // This crashes
        new ConcurrentHashMap<String, String>().keySet();

    }
}
