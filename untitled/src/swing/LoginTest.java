package swing;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    @Test
    public void test(){
        Login lTest = new Login();
        int result = lTest.userLogin("hello", "hello");
        assertEquals(0, result);
    }
}
