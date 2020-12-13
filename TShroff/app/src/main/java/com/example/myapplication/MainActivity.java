package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] MenuList = new String[] {"Marks","SGPA","Attendance","To do list","Student record","Display Marks"};
    ListView M;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M = (ListView) findViewById(R.id.MList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,MenuList);
        M.setAdapter(adapter);

        M.setOnItemClickListener(this);


    }

    public void startdbapp()
    {
        new  SQL(this);
        startActivity(new Intent(this,Marks.class));
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        switch(i)
        {
            case 0: Intent movetomarks = new Intent(getApplicationContext(),Marks.class);
                   startActivity(movetomarks);
                    break;
            case 1: Intent movetocgpa = new Intent(getApplicationContext(),CGPA.class);
                   startActivity(movetocgpa);
                   break;

            /*case 2: Intent movetoattendance = new Intent(getApplicationContext(),DisplayMarks.class);
                startActivity(movetoattendance);
                break;
            case 3: Intent movetodolist = new Intent(getApplicationContext(),Todolist.class);
                startActivity(movetodolist);
                break;
            case 4: Intent movetorecord = new Intent(getApplicationContext(),Record.class);
                startActivity(movetorecord);
                break;*/
            case 5:Intent movetodisplaymarks = new Intent(getApplicationContext(), DisplayMarks.class);
                    startActivity(movetodisplaymarks);
                    break;

        }
        





    }

}