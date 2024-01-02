package com.example.tictacktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button_1 ,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag = 0;
    int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 =findViewById(R.id.button_1);
        button_2 =findViewById(R.id.button_2);
        button_3 =findViewById(R.id.button_3);
        button_4 =findViewById(R.id.button_4);
        button_5 =findViewById(R.id.button_5);
        button_6 =findViewById(R.id.button_6);
        button_7 =findViewById(R.id.button_7);
        button_8 =findViewById(R.id.button_8);
        button_9 =findViewById(R.id.button_9);

    }

    public  void check(View v){

        Button btnCurrent = (Button) v;
        count++;

        if (btnCurrent.getText().equals("")) {

            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {

                b1 = button_1.getText().toString();
                b2 = button_2.getText().toString();
                b3 = button_3.getText().toString();
                b4 = button_4.getText().toString();
                b5 = button_5.getText().toString();
                b6 = button_6.getText().toString();
                b7 = button_7.getText().toString();
                b8 = button_8.getText().toString();
                b9 = button_9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                    Toast.makeText(this, "winner is " + b2, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {

                    Toast.makeText(this, "winner is " + b5, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {

                    Toast.makeText(this, "winner is " + b7, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {

                    Toast.makeText(this, "winner is " + b1, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {

                    Toast.makeText(this, "winner is " + b5, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {

                    Toast.makeText(this, "winner is " + b3, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");



                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {

                    Toast.makeText(this, "winner is " + b1, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");


                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {

                    Toast.makeText(this, "winner is " + b3, Toast.LENGTH_SHORT).show();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");

                }
            }
        }
    }
}