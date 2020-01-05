public class Main {
	public static void main(String[] args) {
		FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();

		System.out.println(fizzBuzzGenerator.divisibleBy(4,2));
		System.out.println(fizzBuzzGenerator.divisibleBy(3,2));
		System.out.println(fizzBuzzGenerator.FizzBuzz(1,15).toString());
	}
}
