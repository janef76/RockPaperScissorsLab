package com.example.user.rockpaperscissorslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    private Button enterButton;
    private TextView title;
    private TextView intro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        enterButton = findViewById(R.id.enterButton);
        title = findViewById(R.id.introHeader);
        intro = findViewById(R.id.introExplanation);
    }

    public void onEnterButtonClicked(View clickedView) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
