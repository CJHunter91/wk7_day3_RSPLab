package com.codeclan.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView output;
    Button buttonRock;
    Button buttonPaper;
    Button buttonScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        output = (TextView)findViewById(R.id.winner_output);
        buttonRock = (Button)findViewById(R.id.rock);
        buttonPaper = (Button)findViewById(R.id.paper);
        buttonScissors = (Button)findViewById(R.id.scissors);
    }

    public void onClickRock(View buttonRock){

        String userInput = "rock";
        String computerResult = RPSLogic.computerChoice();
        String winner = RPSLogic.winnerIs(userInput, computerResult);
        
    }
}
