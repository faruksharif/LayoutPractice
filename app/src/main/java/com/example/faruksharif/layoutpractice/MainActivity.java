package com.example.faruksharif.layoutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean jisshow=true;

    public void fade(View view){

        Log.i("fade","Image clicked");

        ImageView jimageView=(ImageView)findViewById(R.id.jimageView);
        ImageView timageView=(ImageView)findViewById(R.id.timageView);

        if (jisshow) {

            jisshow=false;

            jimageView.animate().alpha(0).setDuration(2000);
            timageView.animate().alpha(1).setDuration(2000);
        }else {
            jisshow=true;
            jimageView.animate().alpha(1).setDuration(2000);
            timageView.animate().alpha(0).setDuration(2000);

        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
