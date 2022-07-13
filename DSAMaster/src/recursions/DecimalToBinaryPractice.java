package recursions;

public class DecimalToBinaryPractice {

	protected int getD2B(int n) {
		if(n==0) {
			return 0;
		}
		return n%2 + 10*getD2B(n/2);
	}
}