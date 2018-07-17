package com.acadview.instagram;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Story extends AppCompatActivity {

    ImageView storyView;
    private int position = 0;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);
        storyView = findViewById(R.id.storyView);
        handler = new Handler();

        setImage(position);
        Log.d("In StoryActivity",""+position);

        startHandler(position);
    }

    private void startHandler(final int pos) {
        this.position = pos;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                setImage(position);

                if(position < 6){
                    position++;
                    startHandler(position);
                }else{
                    finish();
                }
            }
        },2000);

    }

    private void setImage(int position) {

        switch (position) {
            case 0:
                Glide.with(this).load(R.drawable.martin).into(storyView);

                break;

            case 1:
                Glide.with(this).load(R.drawable.shaun).into(storyView);
                break;

            case 2:
                Glide.with(this).load(R.drawable.insideout).into(storyView);
                break;

            case 3:
                Glide.with(this).load(R.drawable.star).into(storyView);
                break;

            case 4:
                Glide.with(this).load(R.drawable.raj1).into(storyView);
                break;
            case 5:
                Glide.with(this).load(R.drawable.insideout).into(storyView);
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        handler.removeCallbacksAndMessages(null);
        finish();

    }
}






