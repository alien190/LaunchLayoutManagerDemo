package com.alien.launchlayoutmanagerdemo;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alien.launchlayoutmanagerdemo.model.Launch;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateData();
    }

    private List<Launch> generateData() {
        String json;
        Gson gson = new Gson();
        try {
            AssetManager am = getAssets();
            InputStream is = am.open("initList.json");
            try (Scanner s = new Scanner(is).useDelimiter("\\A")) {
                json = s.hasNext() ? s.next() : "";
            }
            Type type = new TypeToken<List<Launch>>() {}.getType();
            return gson.fromJson(json, type);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        return null;
    }
}
