package com.example.miniproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbHelp extends SQLiteOpenHelper {
    //database name
    private final static String database_name = "application.db";
    //table name
    private final static String table_name = "sign";
    //table attributes
    private final static String col1 = "id";
    private final static String col2 = "name";
    private final static String col3 = "fname";
    private final static String col4 = "email";
    private final static String col5 = "password";
    private final static String col6 = "phone";

    public dbHelp(@Nullable Context context) {
        super(context, database_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + table_name + "( "+ col1 + " INTEGER PRIMARY KEY AUTOINCREMENT,"+
                col2 + " text, "+ col3 + " text, "+ col4 + " text, "+ col5 + " text, "+ col6 + " text);";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ table_name);
        onCreate(db);

    }
    long addData(String name, String fname, String email, String password, String phone){

        SQLiteDatabase obj = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(col2,name);
        cv.put(col3,fname);
        cv.put(col4,email);
        cv.put(col5,password);
        cv.put(col6,phone);

        return obj.insert(table_name, null, cv);

    }

}
