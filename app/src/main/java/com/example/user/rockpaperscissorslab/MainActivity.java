package com.example.user.rockpaperscissorslab;

import android.content.Intent;
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
    private TextView playerScore;
    private TextView computerScore;
    private Score score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instructions = findViewById(R.id.Instructions);
        gameResult = findViewById(R.id.GameResult);
        paperButton = findViewById(R.id.PaparButton);
        scissorsButton = findViewById(R.id.ScissorButtom);
        rockButton = findViewById(R.id.RockBottom);
        playerScore = findViewById(R.id.playerScore);
        computerScore = findViewById(R.id.computerScore);
        score = new Score();

//        Intent intent = getIntent();
    }

    public void onPaperButtonClick(View clickedView) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String result = game.playGame(Choice.PAPER, score);
        gameResult.setText(result);
        playerScore.setText(score.getPlayerScore());
        computerScore.setText(score.getComputerScore());
        paperButton.setBackgroundColor(getResources().getColor(R.color.babyblue));
        rockButton.setBackgroundColor(getResources().getColor(R.color.originalButtonColor));
        scissorsButton.setBackgroundColor(getResources().getColor(R.color.originalButtonColor));
    }

    public void onScissorsButtonClick(View clickedView) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String result = game.playGame(Choice.SCISSORS, score);
        gameResult.setText(result);
        playerScore.setText(score.getPlayerScore());
        computerScore.setText(score.getComputerScore());
        scissorsButton.setBackgroundColor(getResources().getColor(R.color.babyblue));
        rockButton.setBackgroundColor(getResources().getColor(R.color.originalButtonColor));
        paperButton.setBackgroundColor(getResources().getColor(R.color.originalButtonColor));

    }

    public void onRockButtonClick(View clickedView) {
        RockPaperScissorsGame game = new RockPaperScissorsGame();
        String result = game.playGame(Choice.ROCK, score);
        gameResult.setText(result);
        playerScore.setText(score.getPlayerScore());
        computerScore.setText(score.getComputerScore());
        rockButton.setBackgroundColor(getResources().getColor(R.color.babyblue));
        paperButton.setBackgroundColor(getResources().getColor(R.color.originalButtonColor));
        scissorsButton.setBackgroundColor(getResources().getColor(R.color.originalButtonColor));
    }
}
