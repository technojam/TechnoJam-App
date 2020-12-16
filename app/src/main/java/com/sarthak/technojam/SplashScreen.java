package com.sarthak.technojam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topAnim, bottomAnim;
    ImageView image;
    TextView tvlogo, tvtagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        String tag1 = getColoredSpanned("Throttle", "#54CCEA");
        String tag2 = getColoredSpanned("To","#ffffff");
        String tag3 = getColoredSpanned("Learn","#CE2A72");


        // Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hooks
        image = findViewById(R.id.imageView);

        tvlogo = findViewById(R.id.textView);
        tvtagline = findViewById(R.id.textView1);
        tvtagline.setText(Html.fromHtml(tag1+" "+tag2+" "+tag3));


        image.setAnimation(topAnim);
        tvlogo.setAnimation(bottomAnim);
        tvtagline.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,Login.class);

                Pair[] pairs  = new  Pair[2];
                pairs[0] = new Pair<View,String>(image,"logo_image");
                pairs[1] = new Pair<View,String>(tvlogo,"logo_text");
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreen.this,pairs);
                    startActivity(intent,options.toBundle());
                }

                // startActivity(intent);
                // finish();
            }
        },SPLASH_SCREEN);
    }

    private String getColoredSpanned(String text, String color) {
        String input = "<font color=" + color + ">" + text + "</font>";
        return input;
    }
}