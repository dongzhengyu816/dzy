import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testUser {
    @Test
    void shouldReturnWhiteWhenGiveoneinput(){
        function func = new function();
        String result = func.getValueByString("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
        Assertion.assertEquals("White Win",result);
    }

    @Test
    void shouldReturnWhiteWhenGiveoneinput(){
        function func = new function();
        String result = func.getValueByString("2H 4S 4C 2D 4H","2S 8S AS QS 3S");
        Assertion.assertEquals("White Win",result);
    }

    @Test
    void shouldReturnBlackWhenGiveoneinput(){
        function func = new function();
        String result = func.getValueByString("2H 3H 5H 9H KH","2C 3H 4S 5C 6H");
        Assertion.assertEquals("Black Win",result);
    }

    @Test
    void shouldReturnTieWhenGiveoneinput(){
        function func = new function();
        String result = func.getValueByString("2H 3D 5S 9C KD","2D 3H 5C 9S KH");
        Assertion.assertEquals("Tie",result);
    }
}
