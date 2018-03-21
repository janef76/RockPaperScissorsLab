package com.example.user.rockpaperscissorslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView instructions;
    private TextView gameResult;
    private Button paperButton;
    private Button scissorsButton;
    private Button rockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instructions = findViewById(R.id.Instructions);
        gameResult = findViewById(R.id.GameResult);
        paperButton = findViewById(R.id.PaparButton);
        scissorsButton = findViewById(R.id.ScissorButtom);
        rockButton = findViewById(R.id.RockBottom);
    }

    public void onPaperButtonClick(View clickedView) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String result = game.playGame(Choice.PAPER);
        gameResult.setText(result);
    }

    public void onScissorsButtonClick(View clickedView) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String result = game.playGame(Choice.SCISSORS);
        gameResult.setText(result);
    }

    public void onRockButtonClick(View clickedView) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String result = game.playGame(Choice.ROCK);
        gameResult.setText(result);
    }
}
