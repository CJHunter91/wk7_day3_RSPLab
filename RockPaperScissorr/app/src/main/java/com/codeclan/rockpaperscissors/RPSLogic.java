package com.codeclan.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 09/08/2017.
 */

public class RPSLogic {


    public static String winnerIs(String userChoice, String computerChoice){
        String winner = null;
        userChoice = userChoice.toLowerCase();
        computerChoice = computerChoice.toLowerCase();

        if (userChoice .equals("rock")){
            if(computerChoice .equals("paper")){
                winner = "computer";
            }
            else if(computerChoice .equals("scissors")){
                winner = "user";
            }
            else {
                winner = "draw";
            }
        }

        if (userChoice .equals("paper")){
            if(computerChoice .equals("rock")){
                winner = "user";
            }
            else if(computerChoice .equals("scissors")){
                winner = "computer";
            }
            else {
                winner = "draw";
            }
        }

        if (userChoice .equals("scissors")){
            if(computerChoice .equals("rock")){
                winner = "computer";
            }
            else if(computerChoice .equals("paper")){
                winner = "user";
            }
            else {
                winner = "draw";
            }
        }

        return winner;
    }

    public static ArrayList<String> getArray(){
        ArrayList<String> options = new ArrayList<>();
        options.add("rock");
        options.add("paper");
        options.add("scissors");
        return options;
    }

    public static String computerChoice(){
        Random index = new Random();
        return getArray().get(index.nextInt(2));
    }


}
