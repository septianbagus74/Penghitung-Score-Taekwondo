package com.septianapp.penghitungscoretaekwondo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreMerah, scoreBiru = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void TampilanUntukTeamMerah(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_merah_score);
        scoreView.setText(String.valueOf(score));

        /*
      Menampilkan score Biru di dalam TextView
       */
    }

    public void empatPointMerah(View v) {
        scoreMerah = scoreMerah + 4;
        TampilanUntukTeamMerah(scoreMerah);
        //Menambah Point Merah +4
    }

    public void tigaPointMerah(View v) {
        scoreMerah = scoreMerah + 3;
        TampilanUntukTeamMerah(scoreMerah);
        //Menambah Point Merah +3

    }

    public void satuPointMerah(View v) {
        scoreMerah = scoreMerah + 1;
        TampilanUntukTeamMerah(scoreMerah);

        //Menambah Point Merah +1
    }

    public void TampilanUntukTeamBiru(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_biru_score);
        scoreView.setText(String.valueOf(score));
             /*
      Menampilkan score Biru di dalam TextView
       */

    }

    public void empatPointBiru(View v) {
        scoreBiru = scoreBiru + 4;
        TampilanUntukTeamBiru(scoreBiru);
        // Menambah Point Biru 4

    }

    public void tigaPointBiru(View v) {
        scoreBiru = scoreBiru + 3;
        TampilanUntukTeamBiru(scoreBiru);
        // Menambah Point Biru 3
    }

    public void satuPointBiru(View v) {
        scoreBiru = scoreBiru + 1;
        TampilanUntukTeamBiru(scoreBiru);
        // Menambah Point Biru 1
    }


    public void resetPoint(View v) {
        scoreMerah = 0;
        scoreBiru = 0;
        TampilanUntukTeamMerah(scoreMerah);
        TampilanUntukTeamBiru(scoreBiru);

        Toast.makeText(MainActivity.this, "Berhasil di Reset", Toast.LENGTH_SHORT).show();

        //Mereset point Merah dan Biru menjadi 0
    }
}
