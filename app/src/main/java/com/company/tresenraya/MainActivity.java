package com.company.tresenraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, br;
    String turno = "X";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);

        br = findViewById(R.id.buttonR);

        resetGame();

    }

    public void clickReset(View view){
       resetGame();
    }

    public void click(View view){

        boolean clickOk = false;
        switch (view.getId()){
            case R.id.button1:
                if(b1.getText().toString().isEmpty()) {
                    b1.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button2:
                if(b2.getText().toString().isEmpty()) {
                    b2.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button3:
                if(b3.getText().toString().isEmpty()) {
                    b3.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button4:
                if(b4.getText().toString().isEmpty()) {
                    b4.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button5:
                if(b5.getText().toString().isEmpty()) {
                    b5.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button6:
                if(b6.getText().toString().isEmpty()) {
                    b6.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button7:
                if(b7.getText().toString().isEmpty()) {
                    b7.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button8:
                if(b8.getText().toString().isEmpty()) {
                    b8.setText(turno);
                    clickOk = true;
                }
                break;
            case R.id.button9:
                if(b9.getText().toString().isEmpty()) {
                    b9.setText(turno);
                    clickOk = true;
                }
                break;
        }

        if(clickOk){
            comprobarGanador();

            turno = turno.equals("X") ? "O" : "X";
        }
    }

    void resetGame(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        turno = "X";
    }

    void comprobarGanador(){
        // TODO:
    }
}
