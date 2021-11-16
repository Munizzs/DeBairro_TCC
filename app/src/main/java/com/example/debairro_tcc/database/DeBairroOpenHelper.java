package com.example.debairro_tcc.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DeBairroOpenHelper extends SQLiteOpenHelper {

    public DeBairroOpenHelper(@Nullable Context context) {
        super(context, "debairro", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL( ScriptDLL.getCreateTableUsuario() );

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}