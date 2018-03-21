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

    @Before
    public void before() {
        game = new RockPaperScissorsGame();
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
        assertEquals("you won!", game.compareChoices(Choice.PAPER, Choice.ROCK));
        assertEquals("you won!", game.compareChoices(Choice.ROCK, Choice.SCISSORS));
        assertEquals("you won this time...", game.compareChoices(Choice.SCISSORS, Choice.PAPER));
        assertEquals("you lost!", game.compareChoices(Choice.PAPER, Choice.SCISSORS));
        assertEquals("you lost!", game.compareChoices(Choice.ROCK, Choice.PAPER));
        assertEquals("you lost!", game.compareChoices(Choice.SCISSORS, Choice.ROCK));
        assertEquals("you drew!", game.compareChoices(Choice.PAPER, Choice.PAPER));
        assertEquals("you drew!", game.compareChoices(Choice.SCISSORS, Choice.SCISSORS));
        assertEquals("you drew!", game.compareChoices(Choice.ROCK, Choice.ROCK));

    }

//    @Test
//    public void canGetDisplay() {
//        assertEquals("", game.playGame(Choice.PAPER));
//    }
}
