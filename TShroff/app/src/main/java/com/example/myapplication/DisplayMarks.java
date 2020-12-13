package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


public class DisplayMarks extends AppCompatActivity implements AdapterView.OnItemClickListener {


    String[] Display = new String[] {"Display T1 Marks","Display T2 Marks","Display ESE Marks"};
    ListView D;
    EditText Roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_marks);
        D = (ListView) findViewById(R.id.DList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,Display);
        D.setAdapter(adapter);

        D.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        int rno;
        Roll=(EditText)findViewById(R.id.Eroll);
        Double r=Double.valueOf(Roll.getText().toString());
        rno =(int)Math.round(r);

        System.out.println(rno);
        switch(i)
        {
            case 0:
                    viewT1(rno);
                    break;
            case 1:
                    viewT2(rno);
                    break;

            case 2:
                    viewESE(rno);
                    break;


        }




    }

   public void viewT1(int frno)
    {
        //System.out.println("tSET");
        SQL db=new SQL(this);
        Cursor res=db.displayT1(frno);
     //   System.out.println("Thiny");
        if(res.getCount()==0)
        {
            showMessage("Error","Record not found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append("First name= "+res.getString(1) + "\n");
            buffer.append("Last name= "+res.getString(2) + "\n");
            buffer.append("S1= "+res.getString(3) + "\n");
            buffer.append("S2= "+res.getString(4) + "\n");
            buffer.append("S3= "+res.getString(5) + "\n");
            buffer.append("S4= "+res.getString(6) + "\n");
            buffer.append("S5= "+res.getString(7) + "\n");
        }
        showMessage("T1 Marks",buffer.toString());


    }
    public void viewT2(int frno)
    {
        //System.out.println("tSET");
        SQL db=new SQL(this);
        Cursor res=db.displayT2(frno);
        //   System.out.println("Thiny");
        if(res.getCount()==0)
        {
            showMessage("Error","Record not found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append("First name= "+res.getString(1) + "\n");
            buffer.append("Last name= "+res.getString(2) + "\n");
            buffer.append("S1= "+res.getString(8) + "\n");
            buffer.append("S2= "+res.getString(9) + "\n");
            buffer.append("S3= "+res.getString(10) + "\n");
            buffer.append("S4= "+res.getString(11) + "\n");
            buffer.append("S5= "+res.getString(12) + "\n");
        }
        showMessage("T2 Marks",buffer.toString());


    }

    public void viewESE(int frno)
    {
        //System.out.println("tSET");
        SQL db=new SQL(this);
        Cursor res=db.displayESE(frno);
        //   System.out.println("Thiny");
        if(res.getCount()==0)
        {
            showMessage("Error","Record not found");
            return;
        }
        StringBuffer buffer=new StringBuffer();
        while(res.moveToNext()){

            buffer.append("First name= "+res.getString(1) + "\n");
            buffer.append("Last name= "+res.getString(2) + "\n");
            buffer.append("S1= "+res.getString(13) + "\n");
            buffer.append("S2= "+res.getString(14) + "\n");
            buffer.append("S3= "+res.getString(15) + "\n");
            buffer.append("S4= "+res.getString(16) + "\n");
            buffer.append("S5= "+res.getString(17) + "\n");
        }
        showMessage("ESE Marks",buffer.toString());


    }
    public void showMessage(String title,String Message )
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }



}
