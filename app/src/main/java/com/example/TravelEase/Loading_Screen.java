package com.example.TravelEase;


import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.content.Intent;


public class Loading_Screen extends AppCompatActivity {

    private View loadingLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        loadingLine = findViewById(R.id.loadingLine);

        int parentWidth = getWindow().getDecorView().getWidth();

        ObjectAnimator loadingAnimator = ObjectAnimator.ofFloat(loadingLine, "translationX", 0, parentWidth);
        loadingAnimator.setDuration(3000);
        loadingAnimator.setInterpolator(new AccelerateDecelerateInterpolator());

        loadingAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                openNextActivity();
            }

            @Override
            public void onAnimationCancel(Animator animation) {
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
            }
        });

        loadingAnimator.start();
    }

    private void openNextActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}