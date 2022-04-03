package com.College.vehcileregistration;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatebaseFunction extends SQLiteOpenHelper {
    public static final String DBNME = "collegeProject.db";
    SQLiteDatabase db;

    public DatebaseFunction(Context context) {

        super(context, "collegeProject.db", null, 1);



    }

    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {


    }

    public boolean LoginUser(String Username,String Password){
        db= this.getWritableDatabase();
        Cursor cursor= db.rawQuery("Select * from account Where Rollno = ? and Password= ?",new String[]{Username,Password});
        if (cursor.getCount()>0)
        return true;
           else
               return  false ;
        }



    public Cursor displaynotes(){
        db= this.getWritableDatabase();
        String sql ="Select * from notesdetails";
        Cursor cursor= db.rawQuery(sql,null);
        if (cursor.getCount()>0)
            return cursor;
        else
            return  cursor ;
    }


    public boolean insertdata(String Roll,String Phone,String Password, String Email) {
             db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
        values.put("Email", Email);
        values.put("phoneNumber", Phone);
            values.put("Rollno", Roll);
            values.put("Password", Password);
            long result =  db.insert("account", null, values);
        if( result == -1){

            return false;
        }else
            return true;
        }

    public boolean insertnotes(String title,String Disc) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("title", title);
        values.put("Disc", Disc);

        long result =  db.insert("notesdetails", null, values);
        if( result == -1){

            return false;
        }else
            return true;
    }

    public boolean insertVecical(String VecicalNO,String OwnerName,String OwnerAddress,String DateofMNF,String Dateofreg,String wheeler,String colour,String Compny) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("VehcileNo", VecicalNO);
        values.put("OwnerName", OwnerName);
        values.put("OwnerAddress", OwnerAddress);
        values.put("monthandyear", DateofMNF);
        values.put("Dateofregister", Dateofreg);
        values.put("wheeler", wheeler);
        values.put("vehcilecolour", colour);
        values.put("Company", Compny);

        long result =  db.insert("VecicalInformation", null, values);
        if( result == -1){

            return false;
        }else
            return true;
    }
}


