

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCheckUserName {

    @Test
 void testSetName(){
        User user = new User();
        user.setName("Vasya");

        assertEquals("Vasya", user.getName());
    }
}
