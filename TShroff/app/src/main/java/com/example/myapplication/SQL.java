package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQL extends SQLiteOpenHelper {

    private static final String dbname="android1.db";


    public SQL(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="Create table student (RollNo integer primary key autoincrement, Fname varchar(20), Lname varchar(20), " +
                "T1S1 varchar(20),T1S2 varchar(20),T1S3 varchar(20),T1S4 varchar(20),T1S5 varchar(20)," +
                "T2S1 varchar(20),T2S2 varchar(20),T2S3 varchar(20),T2S4 varchar(20),T2S5 varchar(20), " +
                "ESE1 varchar(20),ESE2 varchar(20),ESE3 varchar(20),ESE4 varchar(20),ESE5 varchar(20))";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("Drop table if exists android1");
        onCreate(db);

    }

    public String addRecord(String s1, String s2, String t1s1,String t1s2,String t1s3,String t1s4,String t1s5,String t2s1,String t2s2,String t2s3,String t2s4,String t2s5,String ese1,String ese2,String ese3,String ese4,String ese5)
    {
        //creating an object of the db
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("Fname",s1);
        cv.put("Lname",s2);
        cv.put("T1S1",t1s1);
        cv.put("T1S2",t1s2);
        cv.put("T1S3",t1s3);
        cv.put("T1S4",t1s4);
        cv.put("T1S5",t1s5);

        cv.put("T2S1",t2s1);
        cv.put("T2S2",t2s2);
        cv.put("T2S3",t2s3);
        cv.put("T2S4",t2s4);
        cv.put("T2S5",t2s5);

        cv.put("ESE1",ese1);
        cv.put("ESE2",ese2);
        cv.put("ESE3",ese3);
        cv.put("ESE4",ese4);
        cv.put("ESE5",ese5);



        long res=db.insert("student",null,cv);

        if(res==-1)
            return "Record not added";
        else
            return "Record added successfully";

    }

    public Cursor displayT1(int frno)
    {
        SQLiteDatabase db=this.getWritableDatabase();
       // System.out.println(db.toString());
      //  System.out.println("S1");
        Cursor ans= db.rawQuery("Select * from student where rollno = " + frno,null );
        //System.out.println("S2");
        System.out.println(ans.toString());

        return ans;
    }

    public Cursor displayT2(int frno)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        // System.out.println(db.toString());
        //  System.out.println("S1");
        Cursor ans= db.rawQuery("Select * from student where rollno = " + frno,null );
        //System.out.println("S2");
        System.out.println(ans.toString());

        return ans;
    }
    public Cursor displayESE(int frno)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        // System.out.println(db.toString());
        //  System.out.println("S1");
        Cursor ans= db.rawQuery("Select * from student where rollno = " + frno,null );
        //System.out.println("S2");
        System.out.println(ans.toString());

        return ans;
    }










}
