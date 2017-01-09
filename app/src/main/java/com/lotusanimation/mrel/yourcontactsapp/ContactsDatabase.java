package com.lotusanimation.mrel.yourcontactsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mr. El on 1/5/2017.
 */

public class ContactsDatabase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "UserContacts.db";
    public static final String TABLE_NAME = "Contact_Table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Last_Name";
    public static final String COL_3 = "First_Name";
    public static final String COL_4 = "Surname";
    public static final String COL_5 = "Mobile_Phone";
    public static final String COL_6 = "Home_Phone";

    public ContactsDatabase(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table" + TABLE_NAME +
                "(ID INTEGER PRIMARY KEY AUTOINCREMENT, Last_Name TEXT, First_Name TEXT, Surname TEXT, Mobile_Phone INTEGER, Home_Phone INTEGER");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" +TABLE_NAME);
        onCreate(db);
    }
}
