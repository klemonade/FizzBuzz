package pair.prog;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void sampleTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void sampleTest2(){
        Assertions.assertEquals(1, 1);
    }

    @Test
    void testFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.makeFizzBuzz(3));
    }

    @Test
    void testBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.makeFizzBuzz(5));
    }

    @Test
    void testFizzBuzz( ) {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.makeFizzBuzz(15));
    }

    @Test
    void testNotFizzBuzz() {
        Assertions.assertEquals("1", FizzBuzz.makeFizzBuzz(1));
    }
}
