package recursions;

import org.apache.logging.log4j.*;

public class RecursionsMainPractice {

	private static Logger log = LogManager.getLogger(RecursionsMainPractice.class.getName());

	public static void main(String[] args) {

		//factorial -->

		FactorialPractice factorial = new FactorialPractice();
		int n = 3;
		int factorialValue = factorial.getFactorial(n);
		log.debug(n + "! = " +factorialValue);		

		//sumOfDigits -->

		SumOfDigitsPractice sumOfDigits = new SumOfDigitsPractice();
		n = 888;
		int sum = sumOfDigits.getSumOfDigits(n);
		log.debug("sum of digits of " +n+ " = "+sum);

		//power -->

		PowerPractice power = new PowerPractice();
		int base = 8;
		int exp = 8;
		int pow = power.getPower(base, exp);
		log.debug(base+"^"+exp+" = "+pow);

		//gcd -->

		GreatestCommonDivisorPractice gcd = new GreatestCommonDivisorPractice();
		int a = 48;
		int b = 18;
		int gcdValue = gcd.getGCD(a, b);
		log.debug("GCD of "+a+","+b+" = "+gcdValue);

		//decimalToBinary -->

		DecimalToBinaryPractice d2b = new DecimalToBinaryPractice();
		n = 8;
		int binaryValue = d2b.getD2B(n);
		log.debug("Binary Value of "+n+" = "+binaryValue);
		
		//productOfArrayPractice  ->
		
		ProductOfArrayPractice product = new ProductOfArrayPractice();
		int[] arr = {1,2,3,4,5};
		int productValue = product.getProductofArray(arr, arr.length);
		log.debug("Product of given array = "+productValue);
		
		//recursiveRangePractice ->
		
		RecursiveRangePractice range = new RecursiveRangePractice();
		n = 6;
		int rangeValue = range.getRecursiveRange(n);
		log.debug("RecursiveRange of "+n+" = "+rangeValue);
		
		//fibonacciPractice ->
		
		FibonacciPractice series = new FibonacciPractice();
		n = 10;
		int value = series.fib(n);
		log.debug(n+"th number in the Fibonacci Sequence = "+value);

		//reversedString -->
		
		ReverseStringPractice rs = new ReverseStringPractice();
		String str = "shubham";
		String revStr = rs.getReversed(str);
		log.debug("\""+str+"\" reversed = "+revStr);
		
		//isPalindrome -->
		
		IsPalindromePractice palindrome = new IsPalindromePractice();
		str = "tacocat";
		boolean isPalindrome = palindrome.checkIsPalindrome(str);
		log.debug("\""+str+"\" is palindrome = "+isPalindrome);
		str = "awesome";
		isPalindrome = palindrome.checkIsPalindrome(str);
		log.debug("\""+str+"\" is palindrome = "+isPalindrome);
	}
}