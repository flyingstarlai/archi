package dev.starlai.archi.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by izayoi on 11/9/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper{

    private final static int DATABASE_VERSION= 1;
    private static final String DATABASE_NAME = "archi.db";
    private static DatabaseHelper dbInstance = null;

    public static DatabaseHelper newInstance(Context context) {
        if(dbInstance == null) dbInstance = new DatabaseHelper(context.getApplicationContext());
        return dbInstance;
    }

    private DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
