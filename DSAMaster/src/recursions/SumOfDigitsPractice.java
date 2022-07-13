package recursions;

public class SumOfDigitsPractice {

	protected int getSumOfDigits(int n) {
		if(n==0 || n<0) {  // base case || constraint
			return 0;
		} else {
			return n%10 + getSumOfDigits(n/10);  	//recursive flow
		}
	}
}