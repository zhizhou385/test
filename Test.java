package test.level.tString;

import org.junit.Assert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {
    @org.junit.Test
    public void testString(){
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        System.out.println("sb = " + sb);
        System.out.println("sb.capacity() = " + sb.capacity());
        sb.trimToSize();
        System.out.println("清空后");
        System.out.println("sb.capacity() = " + sb.capacity());
    }









    @org.junit.Test
    public void test() throws ParseException {
        Assert.assertEquals(3,sum(1,2));
        dateTest();
    }
    public static void dateTest() throws ParseException {
        String dateStr = "2020-2-4 18:09:21";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse(dateStr);
        Assert.assertEquals("2020-02-04 18:09:21",dateFormat.format(date));
    }
    public int sum(int numberA,int numberB){
        return numberA + numberB;
    }
}
