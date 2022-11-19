import Assignment1.Date1;
import Assignment1.Date2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {
    @Test
    public void Test1(){
        Date1 d1 = new Date1(2000, 3, 5);
        Date2 d2 = new Date2(2000,3,5);

        d1.add1day();
        d2.add1day();

        assertEquals(d1.toString(), d2.toString());
    }
        @Test
    public void Test2(){
        Date1 d1 = new Date1(2001, 3, 30);
        Date2 d2 = new Date2(2001,3,30);

        d1.add1day();
        d2.add1day();

        assertEquals(d1.toString(), d2.toString());
    }
        @Test
    public void Test3(){
        Date1 d1 = new Date1(2000, 2, 28);
        Date2 d2 = new Date2(2000,2,28);

        d1.add1day();
        d2.add1day();

        assertEquals(d1.toString(), d2.toString());
    }
        @Test
    public void Test4(){
        Date1 d1 = new Date1(2001, 2, 28);
        Date2 d2 = new Date2(2001,2,28);

        d1.add1day();
        d2.add1day();

        assertEquals(d1.toString(), d2.toString());
    }
        @Test
    public void Test5(){
        Date1 d1 = new Date1(2000, 12, 31);
        Date2 d2 = new Date2(2000,12,31);

        d1.add1day();
        d2.add1day();

        assertEquals(d1.toString(), d2.toString());
    }

}
