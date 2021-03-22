package swing;

import org.junit.Test;

import java.sql.Statement;

import static org.junit.Assert.*;

public class ConnectionTesting {
    @Test
    public void test(){
      DbConnect db = new DbConnect();
      Statement result = db.connection();
      assertEquals(null, result);
    }
}
