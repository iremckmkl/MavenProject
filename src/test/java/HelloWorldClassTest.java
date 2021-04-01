import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldClassTest {

    @Test
    void printhelloworldtest() {

        String expectedstring = "Hello World";

        assertEquals(expectedstring, HelloWorldClass.printhelloworld());

    }

}