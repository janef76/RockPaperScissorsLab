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


    public String compareChoices(Choice userChoice, Choice computerChoice) {
        if (userChoice == computerChoice) {
            return "you drew!";
        } else if (userChoice == Choice.ROCK && computerChoice == Choice.PAPER) {
            return "you lost!";
        } else if (userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) {
            return "you won!";
        } else if (userChoice == Choice.PAPER && computerChoice == Choice.ROCK) {
            return "you won!";
        } else if (userChoice == Choice.PAPER && computerChoice == Choice.SCISSORS) {
            return "you lost!";
        } else if (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) {
            return "you won this time...";
        } else {
            return "you lost!";
        }
    }

    public String playGame(Choice userChoice) {
        Choice computerChoice = getComputerAnswer();

        String result = compareChoices(userChoice, computerChoice);

        return "You chose " + userChoice + '\n' + "The computer chose " + computerChoice + "... " + result;

    }


}
