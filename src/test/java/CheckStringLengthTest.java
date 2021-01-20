
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckStringLengthTest {

    @Test
    public void greaterThan20ReturnsTrue(){
        //Input
        String text1 = "zudsgzdgwzudzu";

        //Actual method
        boolean result = CheckStringLengthApp.longer20(text1);

        //Comparison
        assertEquals(true, result);

    }

    @Test
    public void greaterThan20ReturnsFalse(){
        //Input
        String text1 = "guuxwuz";

        //Actual method
        boolean result = CheckStringLengthApp.longer20(text1);

        //Comparison
        assertEquals(false, result);

    }

    @Test
    public void containsFancyTrue(){
        //Input
        String text1 = "zudszuifancybcxwaubbchubc";

        //Actual method
        boolean result = CheckStringLengthApp.containsFancy(text1);

        //Comparison
        assertEquals(true, result);

    }

    @Test
    public void containsFancyFalse(){
        //Input
        String text1 = "zudszuxwaubbchubc";

        //Actual method
        boolean result = CheckStringLengthApp.containsFancy(text1);

        //Comparison
        assertEquals(false, result);

    }

    @Test
    public void triplicate(){
        //Input
        int a = 4;

        //Actual method
        int result = CheckStringLengthApp.triplicate(a);

        //Comparison
        assertEquals(12, result);

    }


}
