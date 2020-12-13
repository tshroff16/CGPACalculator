package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CGPA extends AppCompatActivity {

    TextView Answer;
    EditText Marks1;
    EditText Marks2;
    EditText Marks3;
    EditText Marks4;
    EditText Marks5;
    Button Calculate;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_g_p);

        Answer= (TextView)findViewById(R.id.CgpaAns);
        Marks1=(EditText)findViewById(R.id.M1);
        Marks2=(EditText)findViewById(R.id.M2);
        Marks3=(EditText)findViewById(R.id.M3);
        Marks4=(EditText)findViewById(R.id.M4);
        Marks5=(EditText)findViewById(R.id.M5);
        Calculate=(Button)findViewById(R.id.cgpabutton);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double m1=Double.valueOf(Marks1.getText().toString());
                Double m2=Double.valueOf(Marks2.getText().toString());
                Double m3=Double.valueOf(Marks3.getText().toString());
                Double m4=Double.valueOf(Marks4.getText().toString());
                Double m5=Double.valueOf(Marks5.getText().toString());

                Double percent=(m1+m2+m3+m4+m5)/47.5;

                Answer.setText("SGPA =" + String.format("%.2f",percent));

            }
        });

    }
}


//setCgpa,getCgpa
//2 constuctors

//mydbhandler-sqllite open helper, oncreate-create queries,onupdate-drop etc
//addhandler
//contentvalue - inbuiltclass
