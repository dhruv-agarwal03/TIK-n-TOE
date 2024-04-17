package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
String s1,s2,s3,s4,s5,s6,s7,s8,s9;
int c=0;
boolean O=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findid();

    }

    private void findid() {
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b3=findViewById(R.id.bt3);
        b4=findViewById(R.id.bt4);
        b5=findViewById(R.id.bt5);
        b6=findViewById(R.id.bt6);
        b7=findViewById(R.id.bt7);
        b8=findViewById(R.id.bt8);
        b9=findViewById(R.id.bt9);
    }
    public void Onclick(View v){
        Button bt= (Button) v;
        c++;
        String t= bt.getText().toString();
        if(t.equals("")) {
            if (O == true) {
                bt.setText("X");
                O = false;
            } else {
                bt.setText("O");
                O = true;
            }

            stchk();
            if (c > 3) {
                if(s1.equals(s2)&&s2.equals(s3)&&!s1.equals("")) {
                    Toast.makeText(this,"Winner:"+s1,Toast.LENGTH_SHORT).show();
                }
               else if(s1.equals(s4)&&s4.equals(s7)&&!s1.equals("")){
                    Toast.makeText(this,"Winner:"+s1,Toast.LENGTH_SHORT).show();
                }
                else if(s4.equals(s5)&&s5.equals(s6)&&!s4.equals("")){
                    Toast.makeText(this,"Winner:"+s4,Toast.LENGTH_SHORT).show();
                }
                else if(s7.equals(s8)&&s7.equals(s9)&&!s9.equals("")){
                    Toast.makeText(this,"Winner:"+s7,Toast.LENGTH_SHORT).show();
                }
                else if(s2.equals(s5)&&s5.equals(s8)&&!s2.equals("")){
                    Toast.makeText(this,"Winner:"+s2,Toast.LENGTH_SHORT).show();
                }
                else if(s3.equals(s6)&&s6.equals(s9)&&!s3.equals("")){
                    Toast.makeText(this,"Winner:"+s6,Toast.LENGTH_SHORT).show();
                }
                else if(s1.equals(s5)&&s5.equals(s9)&&!s1.equals("")){
                    Toast.makeText(this,"Winner:"+s1,Toast.LENGTH_SHORT).show();
                }
                else if(s3.equals(s5)&&s5.equals(s7)&&!s3.equals("")){
                    Toast.makeText(this,"Winner:"+s3,Toast.LENGTH_SHORT).show();
                }
                else if(c>8){
                    Toast.makeText(this,"kya yrr!",Toast.LENGTH_LONG).show();
                    SystemClock.sleep(100);
                    endgame(v);
                }
            }
        }
    }

    public void endgame(View V) {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b6.setText("");
        c=0;
        O=true;

    }

    private void stchk() {
        s1=b1.getText().toString();
        s2=b2.getText().toString();
        s3=b3.getText().toString();
        s4=b4.getText().toString();
        s5=b5.getText().toString();
        s6=b6.getText().toString();
        s7=b7.getText().toString();
        s8=b8.getText().toString();
        s9=b9.getText().toString();
    }
}