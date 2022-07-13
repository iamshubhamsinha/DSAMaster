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

	}
}