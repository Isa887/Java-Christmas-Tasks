import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    public void DivisibleBy() throws Exception {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();
        boolean sum = generator.divisibleBy(4, 2);
        assertEquals(true, sum);
        }

    @Test
    public void isDivisibleBy() throws Exception {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();
        boolean sum = generator.divisibleBy(3, 2);
        assertEquals(false, sum);

    }
    @Test
    public void FizzBuzzTest() throws Exception {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();
        List<String> FizzBuzzList = new ArrayList<String>();
        Collections.addAll(FizzBuzzList,"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(FizzBuzzList, generator.FizzBuzz(1,16));
    }
}