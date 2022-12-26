package com.lutful.advanceddesignanimatior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        Button button;
        ImageView imageView;
        Animation myAnim;
        Animation up_down, zoom_in;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    button = findViewById(R.id.button);
    imageView = findViewById(R.id.imageView);
    myAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.my_anim);
        up_down = AnimationUtils.loadAnimation(MainActivity.this, R.anim.up_down_cont);
    zoom_in = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);


    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            imageView.startAnimation(zoom_in);



        }
    });

    }
}