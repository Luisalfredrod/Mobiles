package com.example.luisa.exam_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRock;
    Button btnPaper;
    Button btnScissor;
    TextView playerScore;
    TextView compScore;
    Button Reset;
    private int winPlayer = 0, winComputer = 0;
    private int rockval = 0, paperval = 1, scissorval = 2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRock = findViewById(R.id.butRock);
        btnPaper= findViewById(R.id.butPaper);
        btnScissor = findViewById(R.id.butScissor);
        Reset = findViewById(R.id.reset);
        playerScore = findViewById(R.id.player1);
        compScore = findViewById(R.id.computer);



        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random myRandom = new Random();
                int compu = myRandom.nextInt(3);


                if (rockval == compu){
                    Toast.makeText(MainActivity.this, "IT'S A DRAW!!!", Toast.LENGTH_LONG).show();
                }else if(compu == 1){
                    Toast.makeText(MainActivity.this, "YOU LOSE!!!", Toast.LENGTH_LONG).show();
                    winComputer +=1;
                    compScore.setText(String.valueOf(winComputer));
                }else{
                    Toast.makeText(MainActivity.this, "YOU WIN!!!", Toast.LENGTH_LONG).show();
                    winPlayer +=1;
                    playerScore.setText(String.valueOf(winPlayer));
                }


            }
        });

        btnPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random myRandom = new Random();
                int compu = myRandom.nextInt(3);


                if (paperval == compu){
                    Toast.makeText(MainActivity.this, "IT'S A DRAW!!!", Toast.LENGTH_LONG).show();
                }else if(compu == 2){
                    Toast.makeText(MainActivity.this, "YOU LOSE!!!", Toast.LENGTH_LONG).show();
                    winComputer +=1;
                    compScore.setText(String.valueOf(winComputer));
                }else{
                    Toast.makeText(MainActivity.this, "YOU WIN!!!", Toast.LENGTH_LONG).show();
                    winPlayer +=1;
                    playerScore.setText(String.valueOf(winPlayer));
                }
            }
        });

        btnScissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random myRandom = new Random();
                int compu = myRandom.nextInt(3);

                if (scissorval == compu){
                    Toast.makeText(MainActivity.this, "IT'S A DRAW!!!", Toast.LENGTH_LONG).show();
                }else if(compu == 0){
                    Toast.makeText(MainActivity.this, "YOU LOSE!!!", Toast.LENGTH_LONG).show();
                    winComputer +=1;
                    compScore.setText(String.valueOf(winComputer));
                }else{
                    Toast.makeText(MainActivity.this, "YOU WIN!!!", Toast.LENGTH_LONG).show();
                    winPlayer +=1;
                    playerScore.setText(String.valueOf(winPlayer));
                }
            }
        });

        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                winPlayer=0;
                winComputer=0;
                playerScore.setText(String.valueOf(winPlayer));
                compScore.setText(String.valueOf(winComputer));
            }
        });

    }
}
