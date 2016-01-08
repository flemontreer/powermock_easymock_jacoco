package fr.lemfi.powermockeasymockjacoco;

import android.content.ContentValues;

public class Class1 {

    private final Class2 class2;

    public Class1(Class2 class2) {
        this.class2 = class2;
    }

    public String doStuff() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("1", 1);
        contentValues.put("2", 2);

        return class2.doClass2Stuff(contentValues);
    }
}
