**Java-Christmas-Tasks**


**Methodology:**

Created a "Testing" folder to write some test code for my test via JUnit5 test library. I ran tests on MainTest.java with the attempt of passing values to another variable, e.g. "sum".
Certain changes were made in order to improve the code which have been documented below.


**Tests:**

1) originally: divisibleBy(4, 2) returns "false" currently
   change:"FizzBuzzGenerator.java" line 7: "2" changed to "0"
   currently: divisibleBy(4, 2) returns "true"
   
   *Test Case:*
   @Test
    void DivisibleBy() throws Exception {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();
        boolean sum = generator.divisibleBy(4, 2);
        assertEquals(false, sum);
        }
    
    When the return statement was changed, the test passed in divisibleBy().
   
   
2) originally: isDivisibleBy(3, 2) returns "true" currently
   change: N/A
   currently: divisibleBy(3, 2) returns "true"
   
   *TestCase:*
   @Test
    void isDivisibleBy() throws Exception {
        FizzBuzzGenerator generator = new FizzBuzzGenerator();
        boolean sum = generator.divisibleBy(3, 2);
        assertEquals(false, sum);
        
    returned: true
   
   
3) originally: fizzBuzzGenerator(1, 15) returns [1, FizzBuzz, 3, 4, FizzBuzz, 6, FizzBuzz, FizzBuzz, 9, 10, FizzBuzz, FizzBuzz, 13, FizzBuzz];
   we are expecting: [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
       
   change 1: "FizzBuzzGenerator.java" line 13: < operator changed to <=     
   produces correct 15 values instead of 14
   after change 1: [1, 2, FizzBuzz, 4, FizzBuzz, FizzBuzz, 7, 8, FizzBuzz, FizzBuzz, 11, FizzBuzz, 13, 14]
        
   change 2: "FizzBuzzGenerator.java" line 7: "2" changed to "0"
   allows for incorrect "FizzBuzz" values to stop occuring
   after change 2: [1, 2, Fizz, 4, Buz, Fizz, 7, 8, Fizz, Buz, 11, Fizz, 13, 14, FizzBuzz]
        
    change 3: "FizzBuzzGenerator.java" line 14: || changed to &&
    extra "FizzBuzz" string on end of returned list, allowed the expected length of 15 to be met (from actual length of 14)
    after change 3: [1, 2, FizzBuzz, 4, FizzBuzz, FizzBuzz, 7, 8, FizzBuzz, FizzBuzz, 11, FizzBuzz, 13, 14, FizzBuzz]
        
    change 4: "FizzBuzzGenerator.java" line 16: "Buz" string changed to "Buzz"
    corrects misspell of "Buz" to "Buzz" in list
    currently: fizzBuzzGenerator(1, 15) returns  [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]
   
   expected = actual, hence test has passed
   
   *TestCase:*
   
   @Test
       public void FizzBuzzTest() throws Exception {
           FizzBuzzGenerator generator = new FizzBuzzGenerator();
           List<String> FizzBuzzList = new ArrayList<String>();
           Collections.addAll(FizzBuzzList,"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
           assertEquals(FizzBuzzList, generator.FizzBuzz(1,16));
       }

 **Locations of changes to original code:**

 1) "FizzBuzzGenerator.java" line 7: 2 int changed to 0
 
 2) "FizzBuzzGenerator.java" line 13: < operator changed to <=
 
 3) "FizzBuzzGenerator.java" line 14: || changed to &&
 
 4) "FizzBuzzGenerator.java" line 16: "Buz" string changed to "Buzz"
