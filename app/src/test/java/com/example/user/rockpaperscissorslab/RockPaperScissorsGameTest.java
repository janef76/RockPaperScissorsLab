package com.example.user.rockpaperscissorslab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 21/03/2018.
 */

public class RockPaperScissorsGameTest {

    RockPaperScissorsGame game;
    Score score;

    @Before
    public void before() {
        game = new RockPaperScissorsGame();
        score = new Score();
    }

    @Test
    public void canGetAllAnswers() {
        assertEquals(3, game.getAllChoices().size());
    }

    @Test
    public void canGetComputerAnswer() {
        assertNotNull(game.getComputerAnswer());
    }

    @Test
    public void canCompareChoices() {
        assertEquals("you won!", game.compareChoices(Choice.PAPER, Choice.ROCK, score));
        assertEquals("you won!", game.compareChoices(Choice.ROCK, Choice.SCISSORS, score));
        assertEquals("you won this time...", game.compareChoices(Choice.SCISSORS, Choice.PAPER, score));
        assertEquals("you lost!", game.compareChoices(Choice.PAPER, Choice.SCISSORS, score));
        assertEquals("you lost!", game.compareChoices(Choice.ROCK, Choice.PAPER, score));
        assertEquals("you lost!", game.compareChoices(Choice.SCISSORS, Choice.ROCK, score));
        assertEquals("you drew!", game.compareChoices(Choice.PAPER, Choice.PAPER, score));
        assertEquals("you drew!", game.compareChoices(Choice.SCISSORS, Choice.SCISSORS, score));
        assertEquals("you drew!", game.compareChoices(Choice.ROCK, Choice.ROCK, score));

    }

//    @Test
//    public void canGetDisplay() {
//        assertEquals("", game.playGame(Choice.PAPER));
//    }
}
