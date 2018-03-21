package com.example.user.rockpaperscissorslab;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 21/03/2018.
 */

public class RockPaperScissorsGame {

    ArrayList<Choice> choices;



    public RockPaperScissorsGame() {
        setUpChoices();
    }

    private void setUpChoices() {
        this.choices = new ArrayList<>();
        choices.add(Choice.ROCK);
        choices.add(Choice.PAPER);
        choices.add(Choice.SCISSORS);
    }

    public ArrayList<Choice> getAllChoices() {
        return this.choices;
    }

    public Choice getComputerAnswer() {
        Collections.shuffle(this.choices);
        return this.choices.get(0);
    }


    public String compareChoices(Choice userChoice, Choice computerChoice, Score score) {
        if (userChoice == computerChoice) {
            return "you drew!";
        } else if (userChoice == Choice.ROCK && computerChoice == Choice.PAPER) {
            score.addOneToComputerScore();
            return "you lost!";
        } else if (userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) {
            score.addOneToPlayerScore();
            return "you won!";
        } else if (userChoice == Choice.PAPER && computerChoice == Choice.ROCK) {
            score.addOneToPlayerScore();
            return "you won!";
        } else if (userChoice == Choice.PAPER && computerChoice == Choice.SCISSORS) {
            score.addOneToComputerScore();
            return "you lost!";
        } else if (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) {
            score.addOneToPlayerScore();
            return "you won this time...";
        } else {
            score.addOneToComputerScore();
            return "you lost!";
        }
    }

    public String playGame(Choice userChoice, Score score) {
        Choice computerChoice = getComputerAnswer();

        String result = compareChoices(userChoice, computerChoice, score);

        return "You chose " + userChoice + '\n' + "The computer chose " + computerChoice + "... " + result;

    }


}
