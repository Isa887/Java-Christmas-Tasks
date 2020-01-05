import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {
	public boolean divisibleBy(int numerator, int Denominator) {
		int answer = 0;
		return numerator % Denominator == 0; //2 int changed to 0
	}

	public List<String> FizzBuzz(int startNumber, int endNumber) {
		List<String> fizzBuzzList = new ArrayList<String>();

		for (int i = startNumber; i <= endNumber ; i++) { // < operator changed to <=
			if(divisibleBy(i, 3) && divisibleBy(i, 5)) fizzBuzzList.add("FizzBuzz"); // || changed to &&
			else if (divisibleBy(i, 3)) fizzBuzzList.add("Fizz");
			else if (divisibleBy(i, 5)) fizzBuzzList.add("Buzz"); // "Buz" string changed to "Buzz"
			else fizzBuzzList.add(Integer.toString(i));
		}
		return fizzBuzzList;
	}
}