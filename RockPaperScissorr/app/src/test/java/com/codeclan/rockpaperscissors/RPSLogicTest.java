package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/08/2017.
 */

public class RPSLogicTest {

    String userChoice;
    String computerChoice;

    @Before
    public void before(){
        computerChoice = "Rock";
    }

    @Test
    public void canPickWinnerRockVPaper(){
        userChoice = "Paper";
        assertEquals("user", RPSLogic.winnerIs(userChoice, computerChoice));
    }

}
