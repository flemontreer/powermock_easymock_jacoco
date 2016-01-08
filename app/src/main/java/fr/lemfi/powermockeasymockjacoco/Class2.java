package fr.lemfi.powermockeasymockjacoco;

import android.content.ContentValues;

public class Class2 {

    public String doClass2Stuff(ContentValues contentValues) {
        return contentValues.getAsString("1") + " class 2";
    }
}
