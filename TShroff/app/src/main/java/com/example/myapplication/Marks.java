package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Marks extends AppCompatActivity {

    EditText DBT1M1;
    EditText DBT1M2;
    EditText DBT1M3;
    EditText DBT1M4;
    EditText DBT1M5;
    EditText DBT2M1;
    EditText DBT2M2;
    EditText DBT2M3;
    EditText DBT2M4;
    EditText DBT2M5;
    EditText DBESEM1;
    EditText DBESEM2;
    EditText DBESEM3;
    EditText DBESEM4;
    EditText DBESEM5;

    EditText DBFN;
    EditText DBLN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);

        DBT1M1=(EditText)findViewById(R.id.T1M1);
        DBT1M2=(EditText)findViewById(R.id.T1M2);
        DBT1M3=(EditText)findViewById(R.id.T1M3);
        DBT1M4=(EditText)findViewById(R.id.T1M4);
        DBT1M5=(EditText)findViewById(R.id.T1M5);
        DBT2M1=(EditText)findViewById(R.id.T2M1);
        DBT2M2=(EditText)findViewById(R.id.T2M2);
        DBT2M3=(EditText)findViewById(R.id.T2M3);
        DBT2M4=(EditText)findViewById(R.id.T2M4);
        DBT2M5=(EditText)findViewById(R.id.T2M5);
        DBESEM1=(EditText)findViewById(R.id.ESEM1);
        DBESEM2=(EditText)findViewById(R.id.ESEM2);
        DBESEM3=(EditText)findViewById(R.id.ESEM3);
        DBESEM4=(EditText)findViewById(R.id.ESEM4);
        DBESEM5=(EditText)findViewById(R.id.ESEM5);
        DBFN=(EditText)findViewById(R.id.FName);
        DBLN=(EditText)findViewById(R.id.LName);
    }

    public void addRecord(View view)
    {
        SQL db=new SQL(this);
      String res= db.addRecord(DBFN.getText().toString(),DBLN.getText().toString(),DBT1M1.getText().toString(),DBT1M2.getText().toString(),DBT1M3.getText().toString(),DBT1M4.getText().toString(),DBT1M5.getText().toString(),DBT2M1.getText().toString(),DBT2M2.getText().toString(),DBT2M3.getText().toString(),DBT2M4.getText().toString(),DBT2M5.getText().toString(),DBESEM1.getText().toString(),DBESEM2.getText().toString(),DBESEM3.getText().toString(),DBESEM4.getText().toString(),DBESEM5.getText().toString());

        Toast.makeText(this,res,Toast.LENGTH_LONG).show();
    }
}


