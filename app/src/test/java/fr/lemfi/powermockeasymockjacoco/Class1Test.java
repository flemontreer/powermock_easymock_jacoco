package fr.lemfi.powermockeasymockjacoco;

import android.content.ContentValues;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Class1.class, ContentValues.class})
public class Class1Test {

    private Class1 class1;
    private Class2 class2;

    @Before
    public void before() {
        class2 = PowerMock.createMock(Class2.class);
        class1 = new Class1(class2);
    }

    @Test
    public void test() throws Exception {

        ContentValues contentValues = PowerMock.createMock(ContentValues.class);
        PowerMock.expectNew(ContentValues.class).andReturn(contentValues);
        contentValues.put("1", 1);
        contentValues.put("2", 2);

        EasyMock.expect(class2.doClass2Stuff(contentValues)).andReturn("haha");

        PowerMock.replayAll();
        String result = class1.doStuff();
        PowerMock.verifyAll();

        Assert.assertEquals("haha", result);
    }
}